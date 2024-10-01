/**
 * @Program Purpose: Orignal 151 Pokemon Pokedex
 * @Name: Luke Butler
 * @Date: August 30, 2024
 * @Section: CSC 331-001
 */
import java.util.Objects;
import java.util.Scanner;


public class aaMain {
    public static void main(String[] args){

        // Bulbasaur line
        Bulbasaur bulbasaur = new Bulbasaur(); // 1
        Ivysaur ivysaur = new Ivysaur(); // 2
        Venusaur venusaur = new Venusaur(); // 3

        // Charmander line
        Charmander charmander = new Charmander(); // 4
        Charmeleon charmeleon = new Charmeleon(); // 5
        Charizard charizard = new Charizard(); // 6

        // Squirtle line
        Squirtle squirtle = new Squirtle(); // 7
        Wartortle wartortle = new Wartortle(); // 8
        Blastoise blastoise = new Blastoise(); // 9

        // Caterpie line
        Caterpie caterpie = new Caterpie(); // 10
        Metapod metapod = new Metapod(); // 11
        Butterfree butterfree = new Butterfree(); // 12

        // Weedle line
        Weedle weedle = new Weedle(); // 13
        Kakuna kakuna = new Kakuna(); // 14
        Beedrill beedrill = new Beedrill(); // 15

        // Pidgey line
        Pidgey pidgey = new Pidgey(); // 16
        Pidgeotto pidgeotto = new Pidgeotto(); // 17
        Pidgeot pidgeot = new Pidgeot(); // 18

        // Rattata line
        Rattata rattata = new Rattata(); // 19
        Raticate raticate = new Raticate(); // 20

        // Spearow line
        Spearow spearow = new Spearow(); // 21
        Fearow fearow = new Fearow(); // 22

        // Ekans line
        Ekans ekans = new Ekans(); // 23
        Arbok arbok = new Arbok(); // 24

        // Pikachu line
        Pikachu pikachu = new Pikachu(); // 25
        Raichu raichu = new Raichu(); // 26

        // Sandshrew line
        Sandshrew sandshrew = new Sandshrew(); // 27
        Sandslash sandslash = new Sandslash(); // 28

        // Nidoran♀ line
        NidoranF nidoranF = new NidoranF(); // 29
        Nidorina nidorina = new Nidorina(); // 30
        Nidoqueen nidoqueen = new Nidoqueen(); // 31

        // Nidoran♂ line
        NidoranM nidoranM = new NidoranM(); // 32
        Nidorino nidorino = new Nidorino(); // 33
        Nidoking nidoking = new Nidoking(); // 34

        // Clefairy line
        Clefairy clefairy = new Clefairy(); // 35
        Clefable clefable = new Clefable(); // 36

        // Vulpix line
        Vulpix vulpix = new Vulpix(); // 37
        Ninetales ninetales = new Ninetales(); // 38

        // Jigglypuff line
        Jigglypuff jigglypuff = new Jigglypuff(); // 39
        Wigglytuff wigglytuff = new Wigglytuff(); // 40

        // Zubat line
        Zubat zubat = new Zubat(); // 41
        Golbat golbat = new Golbat(); // 42

        // Oddish line
        Oddish oddish = new Oddish(); // 43
        Gloom gloom = new Gloom(); // 44
        Vileplume vileplume = new Vileplume(); // 45

        // Paras line
        Paras paras = new Paras(); // 46
        Parasect parasect = new Parasect(); // 47

        // Venonat line
        Venonat venonat = new Venonat(); // 48
        Venomoth venomoth = new Venomoth(); // 49

        // Diglett line
        Diglett diglett = new Diglett(); // 50
        Dugtrio dugtrio = new Dugtrio(); // 51

        // Meowth line
        Meowth meowth = new Meowth(); // 52
        Persian persian = new Persian(); // 53

        // Psyduck line
        Psyduck psyduck = new Psyduck(); // 54
        Golduck golduck = new Golduck(); // 55

        // Mankey line
        Mankey mankey = new Mankey(); // 56
        Primeape primeape = new Primeape(); // 57

        // Growlithe line
        Growlithe growlithe = new Growlithe(); // 58
        Arcanine arcanine = new Arcanine(); // 59

        // Poliwag line
        Poliwag poliwag = new Poliwag(); // 60
        Poliwhirl poliwhirl = new Poliwhirl(); // 61
        Poliwrath poliwrath = new Poliwrath(); // 62

        // Abra line
        Abra abra = new Abra(); // 63
        Kadabra kadabra = new Kadabra(); // 64
        Alakazam alakazam = new Alakazam(); // 65

        // Machop line
        Machop machop = new Machop(); // 66
        Machoke machoke = new Machoke(); // 67
        Machamp machamp = new Machamp(); // 68

        // Bellsprout line
        Bellsprout bellsprout = new Bellsprout(); // 69
        Weepinbell weepinbell = new Weepinbell(); // 70
        Victreebel victreebel = new Victreebel(); // 71

        // Tentacool line
        Tentacool tentacool = new Tentacool(); // 72
        Tentacruel tentacruel = new Tentacruel(); // 73

        // Geodude line
        Geodude geodude = new Geodude(); // 74
        Graveler graveler = new Graveler(); // 75
        Golem golem = new Golem(); // 76

        // Ponyta line
        Ponyta ponyta = new Ponyta(); // 77
        Rapidash rapidash = new Rapidash(); // 78

        // Slowpoke line
        Slowpoke slowpoke = new Slowpoke(); // 79
        Slowbro slowbro = new Slowbro(); // 80

        // Magnemite line
        Magnemite magnemite = new Magnemite(); // 81
        Magneton magneton = new Magneton(); // 82

        // Farfetch'd
        FarfetchD farfetchD = new FarfetchD(); // 83

        // Doduo line
        Doduo doduo = new Doduo(); // 84
        Dodrio dodrio = new Dodrio(); // 85

        // Seel line
        Seel seel = new Seel(); // 86
        Dewgong dewgong = new Dewgong(); // 87

        // Grimer line
        Grimer grimer = new Grimer(); // 88
        Muk muk = new Muk(); // 89

        // Shellder line
        Shellder shellder = new Shellder(); // 90
        Cloyster cloyster = new Cloyster(); // 91

        // Gastly line
        Gastly gastly = new Gastly(); // 92
        Haunter haunter = new Haunter(); // 93
        Gengar gengar = new Gengar(); // 94

        // Onix
        Onix onix = new Onix(); // 95

        // Drowzee line
        Drowzee drowzee = new Drowzee(); // 96
        Hypno hypno = new Hypno(); // 97

        // Krabby line
        Krabby krabby = new Krabby(); // 98
        Kingler kingler = new Kingler(); // 99

        // Voltorb line
        Voltorb voltorb = new Voltorb(); // 100
        Electrode electrode = new Electrode(); // 101

        // Exeggcute line
        Exeggcute exeggcute = new Exeggcute(); // 102
        Exeggutor exeggutor = new Exeggutor(); // 103

        // Cubone line
        Cubone cubone = new Cubone(); // 104
        Marowak marowak = new Marowak(); // 105

        // Hitmonlee
        Hitmonlee hitmonlee = new Hitmonlee(); // 106

        // Hitmonchan
        Hitmonchan hitmonchan = new Hitmonchan(); // 107

        // Lickitung
        Lickitung lickitung = new Lickitung(); // 108

        // Koffing line
        Koffing koffing = new Koffing(); // 109
        Weezing weezing = new Weezing(); // 110

        // Rhyhorn line
        Rhyhorn rhyhorn = new Rhyhorn(); // 111
        Rhydon rhydon = new Rhydon(); // 112

        // Chansey
        Chansey chansey = new Chansey(); // 113

        // Tangela
        Tangela tangela = new Tangela(); // 114

        // Kangaskhan
        Kangaskhan kangaskhan = new Kangaskhan(); // 115

        // Horsea line
        Horsea horsea = new Horsea(); // 116
        Seadra seadra = new Seadra(); // 117

        // Goldeen line
        Goldeen goldeen = new Goldeen(); // 118
        Seaking seaking = new Seaking(); // 119

        // Staryu line
        Staryu staryu = new Staryu(); // 120
        Starmie starmie = new Starmie(); // 121

        // Mr. Mime
        MrMime mrMime = new MrMime(); // 122

        // Scyther
        Scyther scyther = new Scyther(); // 123

        // Jynx
        Jynx jynx = new Jynx(); // 124

        // Electabuzz
        Electabuzz electabuzz = new Electabuzz(); // 125

        // Magmar
        Magmar magmar = new Magmar(); // 126

        // Pinsir
        Pinsir pinsir = new Pinsir(); // 127

        // Tauros
        Tauros tauros = new Tauros(); // 128

        // Magikarp line
        Magikarp magikarp = new Magikarp(); // 129
        Gyarados gyarados = new Gyarados(); // 130

        // Lapras
        Lapras lapras = new Lapras(); // 131

        // Ditto
        Ditto ditto = new Ditto(); // 132

        // Eevee line
        Eevee eevee = new Eevee(); // 133
        Vaporeon vaporeon = new Vaporeon(); // 134
        Jolteon jolteon = new Jolteon(); // 135
        Flareon flareon = new Flareon(); // 136

        // Porygon
        Porygon porygon = new Porygon(); // 137

        // Omanyte line
        Omanyte omanyte = new Omanyte(); // 138
        Omastar omastar = new Omastar(); // 139

        // Kabuto line
        Kabuto kabuto = new Kabuto(); // 140
        Kabutops kabutops = new Kabutops(); // 141

        // Aerodactyl
        Aerodactyl aerodactyl = new Aerodactyl(); // 142

        // Snorlax
        Snorlax snorlax = new Snorlax(); // 143

        // Articuno
        Articuno articuno = new Articuno(); // 144

        // Zapdos
        Zapdos zapdos = new Zapdos(); // 145

        // Moltres
        Moltres moltres = new Moltres(); // 146

        // Dratini line
        Dratini dratini = new Dratini(); // 147
        Dragonair dragonair = new Dragonair(); // 148
        Dragonite dragonite = new Dragonite(); // 149

        // Mewtwo
        Mewtwo mewtwo = new Mewtwo(); // 150

        // Mew
        Mew mew = new Mew(); // 151


        Pokemon[] pokemon = {
                bulbasaur, ivysaur, venusaur,   // 1-3
                charmander, charmeleon, charizard, // 4-6
                squirtle, wartortle, blastoise, // 7-9
                caterpie, metapod, butterfree,  // 10-12
                weedle, kakuna, beedrill, // 13-15
                pidgey, pidgeotto, pidgeot, // 16-18
                rattata, raticate, // 19-20
                spearow, fearow, // 21-22
                ekans, arbok, // 23-24
                pikachu, raichu, // 25-26
                sandshrew, sandslash, // 27-28
                nidoranF, nidorina, nidoqueen, // 29-31
                nidoranM, nidorino, nidoking, // 32-34
                clefairy, clefable, // 35-36
                vulpix, ninetales, // 37-38
                jigglypuff, wigglytuff, // 39-40
                zubat, golbat, // 41-42
                oddish, gloom, vileplume, // 43-45
                paras, parasect, // 46-47
                venonat, venomoth, // 48-49
                diglett, dugtrio, // 50-51
                meowth, persian, // 52-53
                psyduck, golduck, // 54-55
                mankey, primeape, // 56-57
                growlithe, arcanine, // 58-59
                poliwag, poliwhirl, poliwrath, // 60-62
                abra, kadabra, alakazam, // 63-65
                machop, machoke, machamp, // 66-68
                bellsprout, weepinbell, victreebel, // 69-71
                tentacool, tentacruel, // 72-73
                geodude, graveler, golem, // 74-76
                ponyta, rapidash, // 77-78
                slowpoke, slowbro, // 79-80
                magnemite, magneton, // 81-82
                farfetchD, // 83
                doduo, dodrio, // 84-85
                seel, dewgong, // 86-87
                grimer, muk, // 88-89
                shellder, cloyster, // 90-91
                gastly, haunter, gengar, // 92-94
                onix, // 95
                drowzee, hypno, // 96-97
                krabby, kingler, // 98-99
                voltorb, electrode, // 100-101
                exeggcute, exeggutor, // 102-103
                cubone, marowak, // 104-105
                hitmonlee, hitmonchan, // 106-107
                lickitung, // 108
                koffing, weezing, // 109-110
                rhyhorn, rhydon, // 111-112
                chansey, // 113
                tangela, // 114
                kangaskhan, // 115
                horsea, seadra, // 116-117
                goldeen, seaking, // 118-119
                staryu, starmie, // 120-121
                mrMime, // 122
                scyther, // 123
                jynx, // 124
                electabuzz, // 125
                magmar, // 126
                pinsir, // 127
                tauros, // 128
                magikarp, gyarados, // 129-130
                lapras, // 131
                ditto, // 132
                eevee, vaporeon, jolteon, flareon, // 133-136
                porygon, // 137
                omanyte, omastar, // 138-139
                kabuto, kabutops, // 140-141
                aerodactyl, // 142
                snorlax, // 143
                articuno, // 144
                zapdos, // 145
                moltres, // 146
                dratini, dragonair, dragonite, // 147-149
                mewtwo, // 150
                mew // 151
        };


        while(true){
            System.out.print("\nEnter the ID number of the Pokemon you wish to access: ");
            Scanner scanner = new Scanner(System.in);
            int callNumber = scanner.nextInt();

            Pokemon poke = pokemon[(callNumber-1)];

            if (Objects.equals(poke.getType2(), "")){
                System.out.print("\nPokemon: " + poke.getSpecies() + "\nType: " + poke.getType1() + "\n");
                continue;
            }


            System.out.print("\nPokemon: " + poke.getSpecies() + "\nType: " + poke.getType1() + " + " + poke.getType2() + "\n");

        }
    }
}


