package X;

import Y.ARunnableS30S0200000_11;
import com.bytedance.helios.api.consumer.ApmEvent;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.signal.ClosureSignal;
import com.bytedance.helios.sdk.signal.Signal;
import com.bytedance.pumbaa.ruler.adapter.RuleEngineServiceImpl;
import com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.PxD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66119PxD implements InterfaceC66066PwM {
    public static final List<String> LIZJ = C47261Igj.LJJIJIIJI(CardStruct.IStatusCode.DEFAULT, "-1", "false", "null", "", "[]", "{}");
    public InterfaceC65994PvC LIZ;
    public final IRuleEngineService LIZIZ;

    @Override // X.InterfaceC66066PwM
    public final String LIZ() {
        return "PrivacyEvent";
    }

    public C66119PxD() {
        IRuleEngineService LJIILIIL = RuleEngineServiceImpl.LJIILIIL();
        o.LJIIIIZZ(LJIILIIL, "ServiceManager.get().get…ngineService::class.java)");
        this.LIZIZ = LJIILIIL;
    }

    public static final boolean LJ(Map.Entry<String, String> entry) {
        String value;
        String key = entry.getKey();
        if (key == null || key.length() == 0 || (value = entry.getValue()) == null || value.length() == 0) {
            return false;
        }
        List<String> list = LIZJ;
        o.LJI(entry.getValue());
        return !list.contains(r0);
    }

    @Override // X.InterfaceC66066PwM
    public final void LIZIZ(InterfaceC66068PwO aEvent) {
        o.LJIIIZ(aEvent, "aEvent");
        if (aEvent instanceof C66120PxE) {
            C66120PxE c66120PxE = (C66120PxE) aEvent;
            if (c66120PxE.LLF.contains("pair_not_close")) {
                HandlerThreadC64418PPy.LIZ();
                HandlerThreadC64418PPy.LJLJJI.postDelayed(new ARunnableS30S0200000_11(aEvent, this, 1), 30000L);
            } else {
                LIZJ(c66120PxE);
                LIZLLL(c66120PxE);
            }
        }
    }

    public final void LIZJ(C66120PxE c66120PxE) {
        C65964Pui<Signal> c65964Pui;
        boolean LJ;
        IRuleEngineService iRuleEngineService = this.LIZIZ;
        if (c66120PxE.LLF.size() == 0) {
            return;
        }
        if (c66120PxE.LJLILLLLZI.equals("cr")) {
            c65964Pui = C66035Pvr.LIZIZ.LIZ;
        } else if (!c66120PxE.LJLILLLLZI.equals("ar")) {
            return;
        } else {
            c65964Pui = C66034Pvq.LIZIZ.LIZ;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(c66120PxE.LLF);
        HashMap hashMap = new HashMap();
        hashMap.put("content", "begin");
        hashMap.put("monitor_scene", arrayList2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("content", "end");
        hashMap2.put("monitor_scene", arrayList2);
        arrayList.add(hashMap);
        Iterator<Signal> it = c65964Pui.iterator();
        while (it.hasNext()) {
            Signal next = it.next();
            HashMap hashMap3 = new HashMap();
            hashMap3.put("content", next.getContent());
            hashMap3.put("time", Long.valueOf(next.getTime()));
            InterfaceC66086Pwg interfaceC66086Pwg = HeliosEnvImpl.get().LIZIZ;
            if (interfaceC66086Pwg == null) {
                LJ = false;
            } else {
                LJ = interfaceC66086Pwg.LJ();
            }
            hashMap3.put("low_power", Boolean.valueOf(LJ));
            hashMap3.put("monitor_scene", arrayList2);
            if (next instanceof ClosureSignal) {
                hashMap3.put("hash", Long.valueOf(((ClosureSignal) next).getTargetObjectHashCode()));
            }
            arrayList.add(hashMap3);
        }
        arrayList.add(hashMap2);
        long nanoTime = System.nanoTime();
        List LJFF = iRuleEngineService.LJFF(arrayList);
        long nanoTime2 = System.nanoTime();
        String LIZ = C39536FfQ.LIZ(LJFF);
        c66120PxE.LJLLLL.put("attribution", LIZ);
        ApmEvent apmEvent = new ApmEvent("rule_engine_execute_result");
        apmEvent.LIZ(Boolean.TRUE, "attribution");
        apmEvent.LIZ(LIZ, "attribution_result");
        apmEvent.mMetrics.put("attribution_cost", Float.valueOf(((float) (nanoTime2 - nanoTime)) / 1000000.0f));
        C66059PwF.LIZIZ(apmEvent);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(85:35|(80:218|38|(1:40)(1:215)|41|(1:214)(1:45)|46|(1:48)(1:213)|49|50|51|52|(1:54)(1:209)|55|(1:57)(1:208)|58|(1:207)|60|(1:206)|64|(1:(1:(1:68)(1:203))(1:204))(1:205)|69|(1:71)(1:202)|72|(1:74)(1:201)|75|(1:77)(1:200)|78|(1:80)(1:199)|81|(1:83)(1:198)|84|(1:86)(1:197)|87|(1:89)(1:196)|90|(2:93|91)|94|95|(4:98|(3:100|101|102)(1:104)|103|96)|105|106|(2:109|107)|110|111|(1:195)|121|(2:123|(1:(1:192))(1:193))(1:194)|126|(1:128)(1:191)|129|(1:131)(1:190)|132|(1:134)(1:189)|135|(1:137)(1:188)|138|(1:140)(1:187)|141|(1:143)(1:186)|144|(1:146)(1:185)|147|(2:150|148)|151|152|(4:155|(3:157|158|159)(1:161)|160|153)|162|163|(2:166|164)|167|168|(1:172)|173|(1:175)(1:184)|176|(1:178)|179|(1:181)|182|183)|37|38|(0)(0)|41|(1:43)|214|46|(0)(0)|49|50|51|52|(0)(0)|55|(0)(0)|58|(0)|60|(1:62)|206|64|(0)(0)|69|(0)(0)|72|(0)(0)|75|(0)(0)|78|(0)(0)|81|(0)(0)|84|(0)(0)|87|(0)(0)|90|(1:91)|94|95|(1:96)|105|106|(1:107)|110|111|(1:113)|195|121|(0)(0)|126|(0)(0)|129|(0)(0)|132|(0)(0)|135|(0)(0)|138|(0)(0)|141|(0)(0)|144|(0)(0)|147|(1:148)|151|152|(1:153)|162|163|(1:164)|167|168|(2:170|172)|173|(0)(0)|176|(0)|179|(0)|182|183) */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x01bf, code lost:
    
        r24 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x01c0, code lost:
    
        X.C66059PwF.LIZIZ(new X.C65852Psu(X.C16880lQ.LLLLIIIILLL(), r24, "toJsonString startedExtraInfo", (java.util.Map) null, 24));
        r31 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if (r0 == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04b6 A[LOOP:2: B:107:0x04b0->B:109:0x04b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0657 A[LOOP:3: B:148:0x0651->B:150:0x0657, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x06c4 A[LOOP:5: B:164:0x06be->B:166:0x06c4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0438 A[LOOP:0: B:91:0x0432->B:93:0x0438, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x048c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C66120PxE r65) {
        /*
            Method dump skipped, instructions count: 1962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66119PxD.LIZLLL(X.PxE):void");
    }
}
