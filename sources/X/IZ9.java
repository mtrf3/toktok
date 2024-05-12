package X;

import android.util.SparseArray;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class IZ9 extends C46742IWc {
    public final java.util.Map<String, String> LJLJI;

    @Override // X.C46742IWc, X.IZT
    public final void LJJIJ() {
        C46882Iac player = this.LJLILLLLZI.getPlayer();
        if (player == null) {
            return;
        }
        if (IZA.LIZ()) {
            SimRadar.keyScan("CBOF", "[VolumeBalance] EngineVolumeBalanceHelper onAfterEnsurePlayer skip", new Object[0]);
            return;
        }
        int i = this.LJLILLLLZI.s7().get(28);
        player.LJLLLL(329, i);
        SparseArray r7 = this.LJLILLLLZI.r7();
        Float valueOf = Float.valueOf(0.0f);
        float floatValue = ((Float) r7.get(29, valueOf)).floatValue();
        float floatValue2 = ((Float) r7.get(30, valueOf)).floatValue();
        float floatValue3 = ((Float) r7.get(31, valueOf)).floatValue();
        float floatValue4 = ((Float) r7.get(32, valueOf)).floatValue();
        if (i == 1) {
            player.LJLLILLLL(floatValue, 325);
            player.LJLLILLLL(floatValue2, 326);
            player.LJLLILLLL(floatValue3, 327);
            player.LJLLILLLL(floatValue4, 328);
        }
    }

    @Override // X.C46742IWc, X.InterfaceC46820IZc
    public final java.util.Map<String, String> LJIILIIL() {
        return this.LJLJI;
    }

    @Override // X.C46742IWc, X.InterfaceC46820IZc
    public final java.util.Map<String, String> LJJIIJ() {
        return this.LJLJI;
    }

    public IZ9(InterfaceC46804IYm interfaceC46804IYm) {
        super(interfaceC46804IYm);
        this.LJLJI = new HashMap();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(37:12|(1:211)(1:16)|17|(1:210)(1:21)|22|(1:209)(1:26)|27|(1:208)(1:31)|32|(1:207)(1:36)|37|(1:206)(1:41)|42|(8:44|45|46|48|49|50|51|(22:57|58|59|60|(1:62)(1:195)|63|64|66|67|69|70|(1:72)|(1:74)|75|(1:79)|80|81|(2:83|(1:85))|86|(1:189)(1:90)|91|(2:93|94)(2:95|(2:97|(2:99|(2:101|(1:103))(2:104|(2:106|(1:108)))))(2:123|(3:(1:126)(3:148|(1:150)|151)|127|(6:129|130|132|(2:134|(2:136|(2:138|139)(1:141))(1:143))(1:144)|142|139))(4:153|(5:(1:156)(3:164|(1:166)|167)|157|(1:159)|(3:161|(1:163)|110)|122)(2:169|(7:171|(1:173)|174|(3:181|(1:183)|184)|176|(3:178|(1:180)|110)|122)(2:186|(1:188)))|111|(4:113|(1:115)|116|(2:118|119)(1:120))(1:121))))))(1:205)|197|58|59|60|(0)(0)|63|64|66|67|69|70|(0)|(0)|75|(2:77|79)|80|81|(0)|86|(1:88)|189|91|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x028f, code lost:
    
        if (r16 != null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x037a, code lost:
    
        if (r15 != Float.MIN_VALUE) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0452, code lost:
    
        if (r15 != Float.MIN_VALUE) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x04ed, code lost:
    
        if (r15 != Float.MIN_VALUE) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x01f4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x01f5, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x01ee, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x01f0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x01f2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01a1 A[Catch: Exception -> 0x01f2, TRY_LEAVE, TryCatch #7 {Exception -> 0x01f2, blocks: (B:60:0x0195, B:62:0x019b, B:195:0x01a1), top: B:59:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019b A[Catch: Exception -> 0x01f2, TryCatch #7 {Exception -> 0x01f2, blocks: (B:60:0x0195, B:62:0x019b, B:195:0x01a1), top: B:59:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c3 A[Catch: Exception -> 0x01f4, TryCatch #5 {Exception -> 0x01f4, blocks: (B:70:0x01ae, B:72:0x01c3, B:74:0x01ca, B:75:0x01d1, B:77:0x01db, B:79:0x01e3, B:80:0x01e9), top: B:69:0x01ae }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ca A[Catch: Exception -> 0x01f4, TryCatch #5 {Exception -> 0x01f4, blocks: (B:70:0x01ae, B:72:0x01c3, B:74:0x01ca, B:75:0x01d1, B:77:0x01db, B:79:0x01e3, B:80:0x01e9), top: B:69:0x01ae }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01db A[Catch: Exception -> 0x01f4, TryCatch #5 {Exception -> 0x01f4, blocks: (B:70:0x01ae, B:72:0x01c3, B:74:0x01ca, B:75:0x01d1, B:77:0x01db, B:79:0x01e3, B:80:0x01e9), top: B:69:0x01ae }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0256  */
    @Override // X.C46742IWc, X.IZT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(java.util.Map<java.lang.String, java.lang.Object> r30) {
        /*
            Method dump skipped, instructions count: 1272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IZ9.LJIIZILJ(java.util.Map):void");
    }
}
