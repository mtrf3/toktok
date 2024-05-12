package X;

import Y.ACallableS19S0100100_7;
import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.adaptation.PublishPreviewScene;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H8E {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Can't wrap try/catch for region: R(421:1|(1:3)(1:1278)|4|(1:1277)(1:8)|9|(1:1276)(1:13)|14|(1:16)|17|(1:19)|20|(1:22)(1:1275)|23|(1:25)(1:1274)|26|(1:28)(1:1273)|29|(3:31|(1:33)(1:1271)|34)(1:1272)|35|(1:37)(2:1264|(1:1266)(2:1267|(1:1269)(1:1270)))|38|(1:40)|41|(1:43)|44|(1:48)|49|(2:51|(1:53))|54|(1:56)|57|(1:59)(1:1263)|60|(1:62)|63|(1:65)|66|(1:68)|69|(1:71)(1:1262)|(1:73)|74|(1:76)(1:1261)|77|(1:79)(1:1260)|80|(1:82)(1:1259)|83|(1:85)(1:1258)|86|(2:88|(373:90|(1:1256)(1:94)|95|(1:1255)(1:99)|100|101|(1:1254)|105|(1:107)|108|(4:110|(1:119)(1:114)|115|(1:117)(1:118))|120|(1:122)|123|(4:131|(1:145)(1:135)|136|(3:138|(1:144)(1:142)|143))|146|(3:148|(1:150)(1:1252)|151)(1:1253)|152|(1:154)|155|(3:157|(1:159)(1:161)|160)|162|(1:164)|165|(1:171)|172|(2:174|(1:176))|177|(1:179)|180|(2:(1:183)|184)|185|(4:187|(1:189)|190|(1:192))|193|(1:195)(2:1245|(3:1247|(1:1249)(1:1251)|1250))|196|(1:198)(1:1244)|199|(1:201)(1:1243)|202|(1:204)(2:1223|(1:(2:1239|(1:1241)(1:1242))(2:1235|(1:1237)(1:1238)))(1:1231))|205|(1:207)|208|(1:212)|213|(1:215)|216|(3:220|(1:222)(1:224)|223)|225|(325:1209|(1:1211)(1:1222)|1212|(2:1214|(1:1216)(1:1217))(2:1218|(1:(1:1221)))|228|(1:230)|231|(3:233|(1:235)(1:237)|236)|238|(1:240)(1:1208)|241|(6:243|(1:245)(1:1206)|246|(1:1205)(1:250)|251|(1:253)(2:254|(309:260|261|(5:267|(2:269|(2:271|(1:273)))|275|(1:277)(1:279)|278)|280|(2:282|(1:291)(2:286|(1:290)))|292|(1:294)(1:1204)|295|(3:1199|(1:1201)(1:1203)|1202)|299|(1:301)(1:1198)|302|(3:304|(1:310)(1:308)|309)|311|(1:313)(1:1197)|314|(1:316)(2:1194|(1:1196))|317|(2:319|(5:323|(4:326|(4:328|(1:330)|331|332)(1:334)|333|324)|335|336|(1:338)))|339|(1:341)|342|(12:344|(1:346)(1:1190)|347|(4:1178|(2:1180|(1:1182))|1183|(2:1185|(1:1187)(1:1188))(1:1189))|349|(1:1177)|353|(1:355)|356|(1:358)|359|(1:361))(2:1191|(1:1193))|362|(3:366|(2:369|367)|370)|371|(3:373|(1:1173)(1:377)|378)(2:1174|(1:1176))|379|(1:381)|382|(1:384)|385|(1:387)|388|(1:390)|391|(1:393)(1:1172)|394|(1:396)(1:1171)|397|(1:399)|400|(3:402|(2:404|(1:406)(1:408))(1:409)|407)|410|(1:1170)|412|(3:414|(2:420|(1:425)(1:424))(1:418)|419)|426|(1:1169)(2:430|(1:1168))|432|(2:434|(240:436|437|(1:1166)(1:441)|442|(1:444)(1:1165)|445|(1:447)(1:1164)|448|(1:450)(1:1163)|451|(1:453)(1:1162)|454|(1:456)(1:1161)|457|(1:459)|460|(6:462|(1:464)|465|(1:467)(1:472)|468|(1:470)(1:471))|473|(1:475)(1:1160)|476|(1:478)|479|(1:481)(1:1159)|482|(1:484)(1:1158)|485|(1:487)|488|(1:490)|491|(1:493)(1:1157)|494|(1:1156)(1:502)|503|(1:505)|506|(1:1155)(1:510)|511|(1:513)|514|(5:516|(1:518)(1:524)|519|(1:521)(1:523)|522)|525|(1:1154)(1:529)|530|(1:536)|537|(1:539)|540|(8:542|(1:544)(1:563)|545|(1:547)(1:562)|548|(6:551|(1:553)|554|(2:556|557)(1:559)|558|549)|560|561)|564|(1:566)|567|(1:569)(1:1153)|570|(1:572)(1:1152)|573|(1:575)(1:1151)|576|(1:578)(1:1150)|579|(2:581|(1:583)(1:584))|585|(1:587)|588|(1:590)(1:1149)|591|(1:593)(1:1148)|594|(1:596)(1:1147)|597|(2:599|(1:601)(1:602))|603|(1:605)|606|607|(4:610|(1:620)(5:612|613|(1:615)(1:619)|616|617)|618|608)|621|622|623|(1:625)(1:1143)|626|(1:628)(1:1142)|629|(1:631)(1:1141)|632|(1:634)(1:1140)|635|(1:637)|638|(4:1132|1133|(1:1135)|1136)|640|(3:642|(1:644)(1:646)|645)|647|(1:1131)|651|(1:653)(1:1130)|654|(3:656|(1:658)(1:660)|659)|661|(1:663)(1:1129)|664|(1:666)|667|(1:669)(1:1128)|670|(1:672)|673|(1:675)|676|(5:678|(4:681|(3:683|684|685)(1:687)|686|679)|688|689|(1:693))|694|(1:696)|697|(1:699)(1:1127)|700|(1:702)|703|(1:1126)|707|(2:709|(3:711|(1:717)|718)(1:719))|720|(1:722)|723|(1:727)|728|(3:730|(5:736|(4:739|(3:741|742|743)(1:745)|744|737)|746|747|(1:751))(1:734)|735)|752|(1:754)(1:1125)|755|(1:757)(1:1124)|758|(6:760|(1:762)(1:773)|763|(1:765)|766|(3:768|(1:770)(1:772)|771))|774|(3:776|(1:778)(1:780)|779)|781|(1:783)|784|(1:786)|787|(1:789)(1:1123)|790|(1:1122)(1:794)|795|(3:797|(1:(2:799|(2:802|803)(1:801))(2:805|806))|804)|807|(1:1121)(1:811)|812|(3:814|(1:816)(2:818|(1:820)(1:821))|817)|822|(1:828)|829|(1:831)|832|(1:834)|835|(1:837)(1:1120)|838|(1:1119)(1:842)|843|(1:845)|846|(3:854|(1:856)(1:858)|857)|859|(1:865)|866|(1:868)(1:1118)|869|(1:871)(1:1117)|872|(2:875|873)|876|877|(1:879)(1:1116)|880|(1:882)|883|(3:1088|1089|(8:1093|(4:1096|(3:1098|1099|1100)(1:1102)|1101|1094)|1103|1104|(2:1107|1105)|1108|1109|(1:1111)(1:1112)))|885|(3:1060|1061|(8:1065|(4:1068|(3:1070|1071|1072)(1:1074)|1073|1066)|1075|1076|(2:1079|1077)|1080|1081|(1:1083)(1:1084)))|887|(8:893|(4:896|(3:898|899|900)(1:902)|901|894)|903|904|(2:907|905)|908|909|(1:911))|912|(1:914)|915|(1:917)|918|(1:920)|921|(2:923|(1:929))|930|(1:1059)(1:934)|935|(1:939)|940|(1:1058)(1:948)|949|(1:1057)(1:953)|954|(1:956)(1:1056)|957|(1:959)(1:1055)|960|(1:1054)(1:966)|967|(1:969)|970|(1:974)|975|(1:977)(1:1053)|978|(1:1052)(1:982)|983|(1:985)(1:1051)|986|(1:990)|991|(1:995)|996|(1:998)|999|(1:1050)(1:1003)|1004|(1:1049)(1:1008)|(1:1048)(1:1011)|1012|(1:1014)(1:1047)|1015|(1:1017)(1:1046)|1018|(1:1020)(1:1045)|1021|(1:1044)|1023|(2:1024|(2:1026|(1:1028)(1:1041))(2:1042|1043))|1029|(1:1031)(1:1040)|1032|(1:1039)|1036|1037))|1167|437|(1:439)|1166|442|(0)(0)|445|(0)(0)|448|(0)(0)|451|(0)(0)|454|(0)(0)|457|(0)|460|(0)|473|(0)(0)|476|(0)|479|(0)(0)|482|(0)(0)|485|(0)|488|(0)|491|(0)(0)|494|(3:496|498|500)|1156|503|(0)|506|(1:508)|1155|511|(0)|514|(0)|525|(1:527)|1154|530|(3:532|534|536)|537|(0)|540|(0)|564|(0)|567|(0)(0)|570|(0)(0)|573|(0)(0)|576|(0)(0)|579|(0)|585|(0)|588|(0)(0)|591|(0)(0)|594|(0)(0)|597|(0)|603|(0)|606|607|(1:608)|621|622|623|(0)(0)|626|(0)(0)|629|(0)(0)|632|(0)(0)|635|(0)|638|(0)|640|(0)|647|(1:649)|1131|651|(0)(0)|654|(0)|661|(0)(0)|664|(0)|667|(0)(0)|670|(0)|673|(0)|676|(0)|694|(0)|697|(0)(0)|700|(0)|703|(1:705)|1126|707|(0)|720|(0)|723|(2:725|727)|728|(0)|752|(0)(0)|755|(0)(0)|758|(0)|774|(0)|781|(0)|784|(0)|787|(0)(0)|790|(1:792)|1122|795|(0)|807|(1:809)|1121|812|(0)|822|(3:824|826|828)|829|(0)|832|(0)|835|(0)(0)|838|(1:840)|1119|843|(0)|846|(6:848|850|852|854|(0)(0)|857)|859|(3:861|863|865)|866|(0)(0)|869|(0)(0)|872|(1:873)|876|877|(0)(0)|880|(0)|883|(0)|885|(0)|887|(10:889|891|893|(1:894)|903|904|(1:905)|908|909|(0))|912|(0)|915|(0)|918|(0)|921|(0)|930|(1:932)|1059|935|(2:937|939)|940|(1:942)|1058|949|(1:951)|1057|954|(0)(0)|957|(0)(0)|960|(1:962)|1054|967|(0)|970|(2:972|974)|975|(0)(0)|978|(1:980)|1052|983|(0)(0)|986|(2:988|990)|991|(2:993|995)|996|(0)|999|(1:1001)|1050|1004|(1:1006)|1049|(0)|1048|1012|(0)(0)|1015|(0)(0)|1018|(0)(0)|1021|(0)|1023|(3:1024|(0)(0)|1041)|1029|(0)(0)|1032|(1:1034)|1039|1036|1037)))|1207|261|(7:263|265|267|(0)|275|(0)(0)|278)|280|(0)|292|(0)(0)|295|(1:297)|1199|(0)(0)|1202|299|(0)(0)|302|(0)|311|(0)(0)|314|(0)(0)|317|(0)|339|(0)|342|(0)(0)|362|(4:364|366|(1:367)|370)|371|(0)(0)|379|(0)|382|(0)|385|(0)|388|(0)|391|(0)(0)|394|(0)(0)|397|(0)|400|(0)|410|(0)|412|(0)|426|(1:428)|1169|432|(0)|1167|437|(0)|1166|442|(0)(0)|445|(0)(0)|448|(0)(0)|451|(0)(0)|454|(0)(0)|457|(0)|460|(0)|473|(0)(0)|476|(0)|479|(0)(0)|482|(0)(0)|485|(0)|488|(0)|491|(0)(0)|494|(0)|1156|503|(0)|506|(0)|1155|511|(0)|514|(0)|525|(0)|1154|530|(0)|537|(0)|540|(0)|564|(0)|567|(0)(0)|570|(0)(0)|573|(0)(0)|576|(0)(0)|579|(0)|585|(0)|588|(0)(0)|591|(0)(0)|594|(0)(0)|597|(0)|603|(0)|606|607|(1:608)|621|622|623|(0)(0)|626|(0)(0)|629|(0)(0)|632|(0)(0)|635|(0)|638|(0)|640|(0)|647|(0)|1131|651|(0)(0)|654|(0)|661|(0)(0)|664|(0)|667|(0)(0)|670|(0)|673|(0)|676|(0)|694|(0)|697|(0)(0)|700|(0)|703|(0)|1126|707|(0)|720|(0)|723|(0)|728|(0)|752|(0)(0)|755|(0)(0)|758|(0)|774|(0)|781|(0)|784|(0)|787|(0)(0)|790|(0)|1122|795|(0)|807|(0)|1121|812|(0)|822|(0)|829|(0)|832|(0)|835|(0)(0)|838|(0)|1119|843|(0)|846|(0)|859|(0)|866|(0)(0)|869|(0)(0)|872|(1:873)|876|877|(0)(0)|880|(0)|883|(0)|885|(0)|887|(0)|912|(0)|915|(0)|918|(0)|921|(0)|930|(0)|1059|935|(0)|940|(0)|1058|949|(0)|1057|954|(0)(0)|957|(0)(0)|960|(0)|1054|967|(0)|970|(0)|975|(0)(0)|978|(0)|1052|983|(0)(0)|986|(0)|991|(0)|996|(0)|999|(0)|1050|1004|(0)|1049|(0)|1048|1012|(0)(0)|1015|(0)(0)|1018|(0)(0)|1021|(0)|1023|(3:1024|(0)(0)|1041)|1029|(0)(0)|1032|(0)|1039|1036|1037)|227|228|(0)|231|(0)|238|(0)(0)|241|(0)|1207|261|(0)|280|(0)|292|(0)(0)|295|(0)|1199|(0)(0)|1202|299|(0)(0)|302|(0)|311|(0)(0)|314|(0)(0)|317|(0)|339|(0)|342|(0)(0)|362|(0)|371|(0)(0)|379|(0)|382|(0)|385|(0)|388|(0)|391|(0)(0)|394|(0)(0)|397|(0)|400|(0)|410|(0)|412|(0)|426|(0)|1169|432|(0)|1167|437|(0)|1166|442|(0)(0)|445|(0)(0)|448|(0)(0)|451|(0)(0)|454|(0)(0)|457|(0)|460|(0)|473|(0)(0)|476|(0)|479|(0)(0)|482|(0)(0)|485|(0)|488|(0)|491|(0)(0)|494|(0)|1156|503|(0)|506|(0)|1155|511|(0)|514|(0)|525|(0)|1154|530|(0)|537|(0)|540|(0)|564|(0)|567|(0)(0)|570|(0)(0)|573|(0)(0)|576|(0)(0)|579|(0)|585|(0)|588|(0)(0)|591|(0)(0)|594|(0)(0)|597|(0)|603|(0)|606|607|(1:608)|621|622|623|(0)(0)|626|(0)(0)|629|(0)(0)|632|(0)(0)|635|(0)|638|(0)|640|(0)|647|(0)|1131|651|(0)(0)|654|(0)|661|(0)(0)|664|(0)|667|(0)(0)|670|(0)|673|(0)|676|(0)|694|(0)|697|(0)(0)|700|(0)|703|(0)|1126|707|(0)|720|(0)|723|(0)|728|(0)|752|(0)(0)|755|(0)(0)|758|(0)|774|(0)|781|(0)|784|(0)|787|(0)(0)|790|(0)|1122|795|(0)|807|(0)|1121|812|(0)|822|(0)|829|(0)|832|(0)|835|(0)(0)|838|(0)|1119|843|(0)|846|(0)|859|(0)|866|(0)(0)|869|(0)(0)|872|(1:873)|876|877|(0)(0)|880|(0)|883|(0)|885|(0)|887|(0)|912|(0)|915|(0)|918|(0)|921|(0)|930|(0)|1059|935|(0)|940|(0)|1058|949|(0)|1057|954|(0)(0)|957|(0)(0)|960|(0)|1054|967|(0)|970|(0)|975|(0)(0)|978|(0)|1052|983|(0)(0)|986|(0)|991|(0)|996|(0)|999|(0)|1050|1004|(0)|1049|(0)|1048|1012|(0)(0)|1015|(0)(0)|1018|(0)(0)|1021|(0)|1023|(3:1024|(0)(0)|1041)|1029|(0)(0)|1032|(0)|1039|1036|1037))|1257|101|(1:103)|1254|105|(0)|108|(0)|120|(0)|123|(8:125|127|129|131|(1:133)|145|136|(0))|146|(0)(0)|152|(0)|155|(0)|162|(0)|165|(3:167|169|171)|172|(0)|177|(0)|180|(0)|185|(0)|193|(0)(0)|196|(0)(0)|199|(0)(0)|202|(0)(0)|205|(0)|208|(2:210|212)|213|(0)|216|(4:218|220|(0)(0)|223)|225|(0)|227|228|(0)|231|(0)|238|(0)(0)|241|(0)|1207|261|(0)|280|(0)|292|(0)(0)|295|(0)|1199|(0)(0)|1202|299|(0)(0)|302|(0)|311|(0)(0)|314|(0)(0)|317|(0)|339|(0)|342|(0)(0)|362|(0)|371|(0)(0)|379|(0)|382|(0)|385|(0)|388|(0)|391|(0)(0)|394|(0)(0)|397|(0)|400|(0)|410|(0)|412|(0)|426|(0)|1169|432|(0)|1167|437|(0)|1166|442|(0)(0)|445|(0)(0)|448|(0)(0)|451|(0)(0)|454|(0)(0)|457|(0)|460|(0)|473|(0)(0)|476|(0)|479|(0)(0)|482|(0)(0)|485|(0)|488|(0)|491|(0)(0)|494|(0)|1156|503|(0)|506|(0)|1155|511|(0)|514|(0)|525|(0)|1154|530|(0)|537|(0)|540|(0)|564|(0)|567|(0)(0)|570|(0)(0)|573|(0)(0)|576|(0)(0)|579|(0)|585|(0)|588|(0)(0)|591|(0)(0)|594|(0)(0)|597|(0)|603|(0)|606|607|(1:608)|621|622|623|(0)(0)|626|(0)(0)|629|(0)(0)|632|(0)(0)|635|(0)|638|(0)|640|(0)|647|(0)|1131|651|(0)(0)|654|(0)|661|(0)(0)|664|(0)|667|(0)(0)|670|(0)|673|(0)|676|(0)|694|(0)|697|(0)(0)|700|(0)|703|(0)|1126|707|(0)|720|(0)|723|(0)|728|(0)|752|(0)(0)|755|(0)(0)|758|(0)|774|(0)|781|(0)|784|(0)|787|(0)(0)|790|(0)|1122|795|(0)|807|(0)|1121|812|(0)|822|(0)|829|(0)|832|(0)|835|(0)(0)|838|(0)|1119|843|(0)|846|(0)|859|(0)|866|(0)(0)|869|(0)(0)|872|(1:873)|876|877|(0)(0)|880|(0)|883|(0)|885|(0)|887|(0)|912|(0)|915|(0)|918|(0)|921|(0)|930|(0)|1059|935|(0)|940|(0)|1058|949|(0)|1057|954|(0)(0)|957|(0)(0)|960|(0)|1054|967|(0)|970|(0)|975|(0)(0)|978|(0)|1052|983|(0)(0)|986|(0)|991|(0)|996|(0)|999|(0)|1050|1004|(0)|1049|(0)|1048|1012|(0)(0)|1015|(0)(0)|1018|(0)(0)|1021|(0)|1023|(3:1024|(0)(0)|1041)|1029|(0)(0)|1032|(0)|1039|1036|1037) */
    /* JADX WARN: Code restructure failed: missing block: B:1145:0x11fb, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1146:0x11fc, code lost:
    
        X.C3C5.m7constructorimpl(X.C141335gf.LIZ(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0711, code lost:
    
        if (r2 != false) goto L1534;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1001:0x1e0c  */
    /* JADX WARN: Removed duplicated region for block: B:1006:0x1e1e  */
    /* JADX WARN: Removed duplicated region for block: B:1010:0x1e28 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:1014:0x1e32  */
    /* JADX WARN: Removed duplicated region for block: B:1017:0x1e3a  */
    /* JADX WARN: Removed duplicated region for block: B:1020:0x1e46  */
    /* JADX WARN: Removed duplicated region for block: B:1026:0x1eb0  */
    /* JADX WARN: Removed duplicated region for block: B:1031:0x1ec3  */
    /* JADX WARN: Removed duplicated region for block: B:1034:0x1ecb  */
    /* JADX WARN: Removed duplicated region for block: B:1040:0x1ee7  */
    /* JADX WARN: Removed duplicated region for block: B:1042:0x1eea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1044:0x1eec  */
    /* JADX WARN: Removed duplicated region for block: B:1045:0x1eef  */
    /* JADX WARN: Removed duplicated region for block: B:1046:0x1ef3  */
    /* JADX WARN: Removed duplicated region for block: B:1047:0x1ef7  */
    /* JADX WARN: Removed duplicated region for block: B:1051:0x1f05  */
    /* JADX WARN: Removed duplicated region for block: B:1053:0x1f0d  */
    /* JADX WARN: Removed duplicated region for block: B:1055:0x1f1b  */
    /* JADX WARN: Removed duplicated region for block: B:1056:0x1f1f  */
    /* JADX WARN: Removed duplicated region for block: B:1060:0x1aae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:1088:0x1a02 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:1116:0x19ff  */
    /* JADX WARN: Removed duplicated region for block: B:1117:0x196d  */
    /* JADX WARN: Removed duplicated region for block: B:1118:0x1970  */
    /* JADX WARN: Removed duplicated region for block: B:1120:0x1983  */
    /* JADX WARN: Removed duplicated region for block: B:1123:0x19b3  */
    /* JADX WARN: Removed duplicated region for block: B:1124:0x19c1  */
    /* JADX WARN: Removed duplicated region for block: B:1125:0x19c5  */
    /* JADX WARN: Removed duplicated region for block: B:1127:0x15f6  */
    /* JADX WARN: Removed duplicated region for block: B:1128:0x1409  */
    /* JADX WARN: Removed duplicated region for block: B:1129:0x140c  */
    /* JADX WARN: Removed duplicated region for block: B:1130:0x1412  */
    /* JADX WARN: Removed duplicated region for block: B:1132:0x1297 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1140:0x128c  */
    /* JADX WARN: Removed duplicated region for block: B:1141:0x128e  */
    /* JADX WARN: Removed duplicated region for block: B:1142:0x1291  */
    /* JADX WARN: Removed duplicated region for block: B:1143:0x1294  */
    /* JADX WARN: Removed duplicated region for block: B:1147:0x1178  */
    /* JADX WARN: Removed duplicated region for block: B:1148:0x117a  */
    /* JADX WARN: Removed duplicated region for block: B:1149:0x117c  */
    /* JADX WARN: Removed duplicated region for block: B:1150:0x1183  */
    /* JADX WARN: Removed duplicated region for block: B:1151:0x1186  */
    /* JADX WARN: Removed duplicated region for block: B:1152:0x1189  */
    /* JADX WARN: Removed duplicated region for block: B:1153:0x118c  */
    /* JADX WARN: Removed duplicated region for block: B:1157:0x0fe4  */
    /* JADX WARN: Removed duplicated region for block: B:1158:0x0fe7  */
    /* JADX WARN: Removed duplicated region for block: B:1159:0x0ff0  */
    /* JADX WARN: Removed duplicated region for block: B:1160:0x0ff3  */
    /* JADX WARN: Removed duplicated region for block: B:1161:0x1009  */
    /* JADX WARN: Removed duplicated region for block: B:1162:0x100c  */
    /* JADX WARN: Removed duplicated region for block: B:1163:0x1010  */
    /* JADX WARN: Removed duplicated region for block: B:1164:0x1014  */
    /* JADX WARN: Removed duplicated region for block: B:1165:0x1018  */
    /* JADX WARN: Removed duplicated region for block: B:1170:0x103d  */
    /* JADX WARN: Removed duplicated region for block: B:1171:0x104d  */
    /* JADX WARN: Removed duplicated region for block: B:1172:0x1050  */
    /* JADX WARN: Removed duplicated region for block: B:1174:0x1056  */
    /* JADX WARN: Removed duplicated region for block: B:1191:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:1194:0x09b6  */
    /* JADX WARN: Removed duplicated region for block: B:1197:0x09c7  */
    /* JADX WARN: Removed duplicated region for block: B:1198:0x09d2  */
    /* JADX WARN: Removed duplicated region for block: B:1201:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:1203:0x09d5  */
    /* JADX WARN: Removed duplicated region for block: B:1204:0x09d9  */
    /* JADX WARN: Removed duplicated region for block: B:1208:0x0a22  */
    /* JADX WARN: Removed duplicated region for block: B:1209:0x0a28  */
    /* JADX WARN: Removed duplicated region for block: B:1223:0x0a55  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:1243:0x0a9f  */
    /* JADX WARN: Removed duplicated region for block: B:1244:0x0aa2  */
    /* JADX WARN: Removed duplicated region for block: B:1245:0x0aa5  */
    /* JADX WARN: Removed duplicated region for block: B:1253:0x0ac3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0ae1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0a52  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0820  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x08f7  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x090d A[LOOP:1: B:367:0x0907->B:369:0x090d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0b8c  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0ba7  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0bb7  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0bcb  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0bda  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0bee  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0bfe  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0c12  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0c1f  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0c62  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0c81  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0cc5  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0ce8  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0cf8  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0d04  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0d10  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0d30  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0d3c  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0d4d  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0d71  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0da4  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0db9  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0dd5  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0e05  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0e2a  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0e51  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0e5e  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0e68  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0e89  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0e94  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0ea5  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0ecc  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0eea  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0ef5  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0f09  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0f35  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x108b  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x10b4  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x10cc  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x10e2  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x10ee  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x1104  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x1116  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x1123  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x1139  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x1145  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x115b  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x116d  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x11a7 A[Catch: all -> 0x11fb, TryCatch #3 {all -> 0x11fb, blocks: (B:607:0x118f, B:608:0x11a1, B:610:0x11a7, B:613:0x11bf, B:616:0x11d8, B:622:0x11e3), top: B:606:0x118f }] */
    /* JADX WARN: Removed duplicated region for block: B:625:0x121f  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x122b  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x125e  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x1270  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x1282  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x12e5  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x1322  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x1350  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x135a  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x1373  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x138f  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x13a9  */
    /* JADX WARN: Removed duplicated region for block: B:672:0x13b4  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x13cf  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x13ea  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x1457  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x1486  */
    /* JADX WARN: Removed duplicated region for block: B:702:0x1490  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x14b3  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x14e1  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x1575  */
    /* JADX WARN: Removed duplicated region for block: B:725:0x1590  */
    /* JADX WARN: Removed duplicated region for block: B:730:0x15a9  */
    /* JADX WARN: Removed duplicated region for block: B:754:0x1626  */
    /* JADX WARN: Removed duplicated region for block: B:757:0x16bf  */
    /* JADX WARN: Removed duplicated region for block: B:760:0x16cb  */
    /* JADX WARN: Removed duplicated region for block: B:776:0x16f5  */
    /* JADX WARN: Removed duplicated region for block: B:783:0x170a  */
    /* JADX WARN: Removed duplicated region for block: B:786:0x1736  */
    /* JADX WARN: Removed duplicated region for block: B:789:0x1755  */
    /* JADX WARN: Removed duplicated region for block: B:792:0x1765  */
    /* JADX WARN: Removed duplicated region for block: B:797:0x178e  */
    /* JADX WARN: Removed duplicated region for block: B:809:0x17c1  */
    /* JADX WARN: Removed duplicated region for block: B:814:0x17f7  */
    /* JADX WARN: Removed duplicated region for block: B:824:0x1820  */
    /* JADX WARN: Removed duplicated region for block: B:831:0x1834  */
    /* JADX WARN: Removed duplicated region for block: B:834:0x1845  */
    /* JADX WARN: Removed duplicated region for block: B:837:0x186d  */
    /* JADX WARN: Removed duplicated region for block: B:840:0x1891  */
    /* JADX WARN: Removed duplicated region for block: B:845:0x18b9  */
    /* JADX WARN: Removed duplicated region for block: B:848:0x18c6  */
    /* JADX WARN: Removed duplicated region for block: B:856:0x18e9  */
    /* JADX WARN: Removed duplicated region for block: B:858:0x1978  */
    /* JADX WARN: Removed duplicated region for block: B:861:0x18f5  */
    /* JADX WARN: Removed duplicated region for block: B:868:0x1910  */
    /* JADX WARN: Removed duplicated region for block: B:871:0x1928  */
    /* JADX WARN: Removed duplicated region for block: B:875:0x195b A[LOOP:7: B:873:0x1955->B:875:0x195b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:879:0x19d7  */
    /* JADX WARN: Removed duplicated region for block: B:882:0x19e3  */
    /* JADX WARN: Removed duplicated region for block: B:889:0x1b5a  */
    /* JADX WARN: Removed duplicated region for block: B:896:0x1b7e  */
    /* JADX WARN: Removed duplicated region for block: B:907:0x1ba8 A[LOOP:9: B:905:0x1ba2->B:907:0x1ba8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:911:0x1f38  */
    /* JADX WARN: Removed duplicated region for block: B:914:0x1bcd  */
    /* JADX WARN: Removed duplicated region for block: B:917:0x1bfe  */
    /* JADX WARN: Removed duplicated region for block: B:920:0x1c2d  */
    /* JADX WARN: Removed duplicated region for block: B:923:0x1c41  */
    /* JADX WARN: Removed duplicated region for block: B:932:0x1c63  */
    /* JADX WARN: Removed duplicated region for block: B:937:0x1c73  */
    /* JADX WARN: Removed duplicated region for block: B:942:0x1ca0  */
    /* JADX WARN: Removed duplicated region for block: B:951:0x1ce4  */
    /* JADX WARN: Removed duplicated region for block: B:956:0x1d22  */
    /* JADX WARN: Removed duplicated region for block: B:959:0x1d30  */
    /* JADX WARN: Removed duplicated region for block: B:962:0x1d3e  */
    /* JADX WARN: Removed duplicated region for block: B:969:0x1d5f  */
    /* JADX WARN: Removed duplicated region for block: B:972:0x1d77  */
    /* JADX WARN: Removed duplicated region for block: B:977:0x1d8c  */
    /* JADX WARN: Removed duplicated region for block: B:980:0x1da3  */
    /* JADX WARN: Removed duplicated region for block: B:985:0x1db5  */
    /* JADX WARN: Removed duplicated region for block: B:988:0x1dbd  */
    /* JADX WARN: Removed duplicated region for block: B:993:0x1dd0  */
    /* JADX WARN: Removed duplicated region for block: B:998:0x1de7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIZ(X.C145995oB r25, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r26, X.G6F r27, boolean r28, boolean r29, X.InterfaceC88472Yns r30) {
        /*
            Method dump skipped, instructions count: 8020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H8E.LJIIIZ(X.5oB, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.G6F, boolean, boolean, X.Yns):void");
    }

    public static String LIZ(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String[] strArr = (String[]) new OJD(";").split(str, 0).toArray(new String[0]);
            StringBuilder sb = new StringBuilder();
            for (String str3 : strArr) {
                int parseInt = CastIntegerProtector.parseInt(str3);
                if (parseInt != 1) {
                    if (parseInt != 2) {
                        if (parseInt != 3) {
                            if (parseInt != 101) {
                                str2 = "";
                            } else {
                                str2 = "twitter";
                            }
                        } else {
                            str2 = "instagram_story";
                        }
                    } else {
                        str2 = "instagram";
                    }
                } else {
                    str2 = "local";
                }
                if (!TextUtils.isEmpty(str2)) {
                    sb.append(str2);
                    sb.append(",");
                }
            }
            String sb2 = sb.toString();
            o.LJIIIIZZ(sb2, "sb.toString()");
            if (ujb.o.LJJJJ(sb2, ",", false)) {
                sb2 = sb2.substring(0, sb2.length() - 1);
                o.LJIIIIZZ(sb2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            return sb2;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002e A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(java.lang.String r1) {
        /*
            if (r1 == 0) goto L9
            int r0 = r1.hashCode()
            switch(r0) {
                case -162636765: goto L26;
                case 303658702: goto L1d;
                case 1677969418: goto L14;
                case 1908884482: goto Lb;
                default: goto L9;
            }
        L9:
            r0 = 1
        La:
            return r0
        Lb:
            java.lang.String r0 = "music_enter_method"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2e
            goto L9
        L14:
            java.lang.String r0 = "music_enter_position"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2e
            goto L9
        L1d:
            java.lang.String r0 = "has_tracker_shoot_event"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2e
            goto L9
        L26:
            java.lang.String r0 = "music_shoot_from_search"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
        L2e:
            r0 = 0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H8E.LIZIZ(java.lang.String):boolean");
    }

    public static OSZ LIZJ(VideoPublishEditModel videoPublishEditModel) {
        int i;
        NLETrackSlot LJIIIIZZ;
        NLESegment LJI;
        NLESegment LJI2;
        if (videoPublishEditModel.isCutSameVideoType()) {
            return new OSZ(Integer.valueOf(videoPublishEditModel.videoCount), Integer.valueOf(videoPublishEditModel.photoCount));
        }
        ArrayList<ImportVideoInfo> arrayList = videoPublishEditModel.importInfoList;
        o.LJIIIIZZ(arrayList, "model.importInfoList");
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            Iterator<ImportVideoInfo> it = arrayList.iterator();
            i = 0;
            while (it.hasNext()) {
                if (C44694HgQ.LJIJI(it.next().getOriginImportPath(), true) && (i = i + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        int size = videoPublishEditModel.importInfoList.size() - i;
        if (size > 0 || i > 0) {
            if (C78685UuP.LJJJZ(videoPublishEditModel.nleData)) {
                C5K0.LIZ(2);
                NLEEditor nLEEditor = new NLEEditor();
                nLEEditor.LJI(videoPublishEditModel.nleData);
                NLETrack mainTrack = nLEEditor.LJ().getMainTrack();
                if (mainTrack != null) {
                    Iterator<NLETrackSlot> it2 = mainTrack.LJIILL().iterator();
                    while (it2.hasNext()) {
                        NLETrackSlot next = it2.next();
                        NLESegment LJI3 = next.LJI();
                        if (LJI3 != null && LJI3.LIZIZ().LJFF() == EnumC123874tb.IMAGE && (LJIIIIZZ = next.LJIIIIZZ()) != null && (LJI = LJIIIIZZ.LJI()) != null && LJI.LIZIZ().LJFF() == EnumC123874tb.VIDEO) {
                            size++;
                        }
                    }
                }
            }
            return new OSZ(Integer.valueOf(size), Integer.valueOf(i));
        }
        if (C78685UuP.LJJJZ(videoPublishEditModel.nleData)) {
            C5K0.LIZ(2);
            NLEEditor nLEEditor2 = new NLEEditor();
            nLEEditor2.LJI(videoPublishEditModel.nleData);
            NLETrack mainTrack2 = nLEEditor2.LJ().getMainTrack();
            if (mainTrack2 != null) {
                Iterator<NLETrackSlot> it3 = mainTrack2.LJIILL().iterator();
                while (it3.hasNext()) {
                    NLETrackSlot next2 = it3.next();
                    EnumC123874tb LJFF = next2.LJI().LIZIZ().LJFF();
                    EnumC123874tb enumC123874tb = EnumC123874tb.VIDEO;
                    if (LJFF == enumC123874tb) {
                        size++;
                    }
                    if (next2.LJI().LIZIZ().LJFF() == EnumC123874tb.IMAGE) {
                        i++;
                        NLETrackSlot LJIIIIZZ2 = next2.LJIIIIZZ();
                        if (LJIIIIZZ2 != null && (LJI2 = LJIIIIZZ2.LJI()) != null && LJI2.LIZIZ().LJFF() == enumC123874tb) {
                            size++;
                        }
                    }
                }
            }
            return new OSZ(Integer.valueOf(size), Integer.valueOf(i));
        }
        return new OSZ(Integer.valueOf(size), Integer.valueOf(i));
    }

    public static void LIZLLL(java.util.Map map, HashMap hashMap) {
        HashMap hashMap2 = (HashMap) map;
        String str = (String) hashMap2.get("music_selected_from");
        if (str != null && ujb.o.LJJJJ(str, "_search", false)) {
            Object obj = hashMap.get("music_search_id");
            if (obj != null) {
                hashMap2.put("music_search_id", obj);
            }
            Object obj2 = hashMap.get("music_search_result_id");
            if (obj2 != null) {
                hashMap2.put("music_search_result_id", obj2);
            }
            Object obj3 = hashMap.get("music_list_item_id");
            if (obj3 != null) {
                hashMap2.put("music_list_item_id", obj3);
            }
        }
    }

    public static void LJ(java.util.Map map, HashMap hashMap) {
        Object obj = hashMap.get("prop_search_info");
        if (obj != null) {
            ((HashMap) map).put("prop_search_info", obj);
        }
        Object obj2 = hashMap.get("has_search");
        if (obj2 != null) {
            ((HashMap) map).put("has_search", obj2);
        }
        Object obj3 = hashMap.get("creation_id");
        if (obj3 != null) {
            ((HashMap) map).put("creation_id", obj3);
        }
    }

    public static void LJFF(java.util.Map map, HashMap hashMap) {
        if (hashMap.containsKey("shoot_from_music")) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (!o.LJ(entry.getKey(), "shoot_from_music")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                ((HashMap) map).put(entry2.getKey(), entry2.getValue());
            }
        }
    }

    public static void LJI(VideoPublishEditModel videoPublishEditModel, HashMap hashMap, java.util.Map map) {
        boolean z;
        String musicOriginWithCheck = videoPublishEditModel.getMusicOriginWithCheck();
        String musicId = videoPublishEditModel.getMusicId();
        if (musicId == null || musicId.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (!o.LJ("shoot_page_search", musicOriginWithCheck) && !o.LJ("edit_page_search", musicOriginWithCheck))) {
            try {
                if (hashMap.containsKey("music_search_id")) {
                    hashMap.remove("music_search_id");
                    hashMap.remove("music_search_result_id");
                    hashMap.remove("music_list_item_id");
                }
            } catch (Exception unused) {
            }
        } else {
            Object obj = hashMap.get("music_shoot_from_search");
            if (obj != null) {
                hashMap.put("shoot_from_search", obj);
            }
            Object obj2 = hashMap.get("music_enter_method");
            if (obj2 != null) {
                hashMap.put("enter_method", obj2);
            }
            Object obj3 = hashMap.get("music_enter_position");
            if (obj3 != null) {
                hashMap.put("enter_position", obj3);
            }
        }
        if (C78685UuP.LJJJZ(videoPublishEditModel.getMusicId()) && !hashMap.containsKey("music_search_id")) {
            if (o.LJ("single_song", musicOriginWithCheck) || o.LJ("original", musicOriginWithCheck)) {
                if (o.LJ("single_song", hashMap.get("shoot_from_search")) || o.LJ("music_card", hashMap.get("search_enter_position"))) {
                    Object obj4 = hashMap.get("search_id");
                    if (obj4 != null) {
                        ((HashMap) map).put("music_search_id", obj4);
                    }
                    Object obj5 = hashMap.get("search_result_id");
                    if (obj5 != null) {
                        ((HashMap) map).put("music_search_result_id", obj5);
                    }
                    Object obj6 = hashMap.get("list_item_id");
                    if (obj6 != null) {
                        ((HashMap) map).put("music_list_item_id", obj6);
                    }
                }
            }
        }
    }

    public static /* synthetic */ void LJIIIIZZ(H8E h8e, Activity activity, VideoPublishEditModel videoPublishEditModel, boolean z, PublishPreviewScene publishPreviewScene, boolean z2, InterfaceC88472Yns interfaceC88472Yns, Bundle bundle, int i) {
        boolean z3 = z2;
        PublishPreviewScene publishPreviewScene2 = publishPreviewScene;
        InterfaceC88472Yns interfaceC88472Yns2 = interfaceC88472Yns;
        Bundle bundle2 = bundle;
        if ((i & 32) != 0) {
            publishPreviewScene2 = null;
        }
        if ((i & 64) != 0) {
            z3 = false;
        }
        if ((i & 128) != 0) {
            interfaceC88472Yns2 = null;
        }
        if ((i & 256) != 0) {
            bundle2 = C16880lQ.LLJJIJI(activity.getIntent());
        }
        h8e.LJII(activity, videoPublishEditModel, null, null, z, publishPreviewScene2, z3, interfaceC88472Yns2, bundle2);
    }

    public final void LJII(Activity context, VideoPublishEditModel model, GSR gsr, G6F g6f, boolean z, PublishPreviewScene publishPreviewScene, boolean z2, InterfaceC88472Yns<? super C145995oB, C76800UCe> interfaceC88472Yns, Bundle bundle) {
        ShootExtraData shootExtraData;
        Integer isCommercialUse;
        String str;
        String str2;
        String str3;
        Object obj;
        String str4;
        int i;
        int i2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(model, "model");
        if (CommerceMediaServiceImpl.LIZJ().LJIIZILJ() && (shootExtraData = model.creativeFlowData.getShootExtraData()) != null && (isCommercialUse = shootExtraData.isCommercialUse()) != null) {
            C145995oB LIZIZ = GFJ.LIZIZ(isCommercialUse.intValue(), "is_commercial_use");
            LIZIZ.LIZJ(shootExtraData.getClipId(), "clip_id");
            LIZIZ.LJI("meta_song_id", shootExtraData.getMetaSongId());
            LIZIZ.LIZJ(shootExtraData.getCmlClipId(), "cml_clip_id");
            LIZIZ.LJI("cml_meta_song_id", shootExtraData.getCmlMetaSongId());
            LIZIZ.LIZJ(shootExtraData.getSuggestionId(), "suggestion_id");
            if (C78685UuP.LJJJZ(shootExtraData.getVersion())) {
                LIZIZ.LIZLLL("version", shootExtraData.getVersion());
            }
            FMX.LJIIL("ttelite_BA_music_detail_publish", LIZIZ.LIZ);
        }
        long currentTimeMillis = System.currentTimeMillis();
        String str5 = "1";
        if (C83732Wtc.LJIIJ(context)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        if (C82127WLb.LIZ(context)) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        int LJIJ = C62819Ol5.LJIJ(context);
        Object obj2 = null;
        if (bundle != null) {
            str3 = bundle.getString("extra_edit_effect_uid");
        } else {
            str3 = null;
        }
        OSZ LIZ2 = H8G.LIZ(model, str3);
        if (LIZ2 != null) {
            obj = LIZ2.getFirst();
            obj2 = LIZ2.getSecond();
        } else {
            obj = null;
        }
        if (publishPreviewScene != null && publishPreviewScene.LLLII()) {
            if (publishPreviewScene.LLLI()) {
                str4 = "1";
            } else {
                str4 = "2";
            }
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        C145995oB c145995oB = new C145995oB();
        String str6 = (String) obj;
        if (str6 != null) {
            c145995oB.LIZLLL(str6, (String) obj2);
        }
        c145995oB.LJI("is_wide_angle", str);
        c145995oB.LJI("is_anti_shake", str2);
        c145995oB.LIZ(LJIJ, "brightness");
        c145995oB.LIZLLL("is_from_preview", str4);
        if (model.isPoi()) {
            OHI.LIZ.getClass();
            if (!OHI.LJ(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            c145995oB.LIZLLL("enable_location", str5);
        }
        if (gsr != null) {
            try {
                InputFilter[] filters = gsr.getFilters();
                o.LJIIIIZZ(filters, "filters");
                if (filters.length != 0) {
                    InputFilter inputFilter = filters[0];
                    o.LJII(inputFilter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.caption.EmoticonFilter");
                    GST gst = (GST) inputFilter;
                    if (gst.LJLIL) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    c145995oB.LIZ(i, "hit_caption_limit");
                    gst.LJLIL = false;
                    if (gsr.getText() != null) {
                        Editable text = gsr.getText();
                        if (text != null) {
                            i2 = text.length();
                        } else {
                            i2 = 0;
                        }
                        model.mentionEditTextLength = i2;
                    }
                }
                ArrayList arrayList = new ArrayList();
                ArrayList<TextExtraStruct> textExtraStructList = gsr.getTextExtraStructList();
                if (textExtraStructList != null) {
                    Iterator<TextExtraStruct> it = textExtraStructList.iterator();
                    while (it.hasNext()) {
                        String userId = it.next().getUserId();
                        o.LJIIIIZZ(userId, "it.userId");
                        arrayList.add(userId);
                    }
                }
                String abstractCollection = arrayList.toString();
                if (!TextUtils.isEmpty(abstractCollection) && abstractCollection.length() >= 2 && abstractCollection != null) {
                    String substring = abstractCollection.substring(1, abstractCollection.length() - 1);
                    o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    c145995oB.LIZLLL("social_mention_user", substring);
                }
            } catch (Throwable th) {
                C41859Gbn LIZIZ2 = C1I0.LIZIZ();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("mentionEditText: ");
                LIZ3.append(V0N.LJJIJL(th));
                LIZIZ2.LIZJ("publish_event", X1D.LIZIZ(LIZ3));
            }
        }
        c145995oB.LIZ(model.hasTextSticker() ? 1 : 0, "text_added");
        if (o.LJ("direct_shoot", model.mShootWay)) {
            c145995oB.LIZLLL("is_story_enhanced_entrance", C79004UzY.LJJJJLL(model.creativeModel.commonMobModel.isStoryEnhancedEntrance));
        }
        if (C42549Gmv.LIZJ) {
            C10K.LIZJ(new G81(this, c145995oB, model, g6f, z, z2, interfaceC88472Yns));
        } else {
            LJIIIZ(c145995oB, model, g6f, z, z2, interfaceC88472Yns);
        }
        if (model.isMultiVideoEdit()) {
            long j = 0;
            long j2 = 0;
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : model.getCurMultiEditVideoRecordData().segmentDataList) {
                if (multiEditVideoSegmentRecordData.frameLeakProbability == 1) {
                    j += multiEditVideoSegmentRecordData.getEndTime() - multiEditVideoSegmentRecordData.getStartTime();
                }
                j2 += multiEditVideoSegmentRecordData.getEndTime() - multiEditVideoSegmentRecordData.getStartTime();
            }
            if (j > 0) {
                C145995oB LIZ4 = UFE.LIZ(j, "multi_edit_null_frame_time");
                LIZ4.LIZIZ(j2, "multi_edit_all_time");
                LIZ4.LJ("multi_edit_use_sticker", !TextUtils.isEmpty(model.mStickerID));
                FMX.LJIIL("multi_edit_video_frame", LIZ4.LIZ);
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (C42549Gmv.LIZIZ) {
            C10K.LIZ(new ACallableS19S0100100_7(currentTimeMillis2, model, 1));
        } else {
            C145995oB LJI = C5V5.LJI(model);
            LJI.LIZ(110, "publish_step");
            LJI.LIZIZ(currentTimeMillis2, "duration");
            FMX.LJIIL("parallel_publish_result", LJI.LIZ);
        }
        C41859Gbn LIZIZ3 = C1I0.LIZIZ();
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("finish report publish event, cost time: ");
        LIZ5.append(currentTimeMillis2);
        LIZ5.append("ms");
        LIZIZ3.LIZJ("publish_event", X1D.LIZIZ(LIZ5));
    }
}
