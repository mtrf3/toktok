package X;

import Y.ARunnableS46S0100000_10;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.ad.feed.ibe.CommerceIBEService;
import com.ss.android.ugc.aweme.ad.feed.ibe.setting.IBEConfigSettings;
import com.ss.android.ugc.aweme.commerce.CommercialVideoInfo;
import com.ss.android.ugc.aweme.commerce.IBEInfo;
import com.ss.android.ugc.aweme.commerce.InteractiveBrandedEffectInfo;
import com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS56S0400000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NDX implements InterfaceC59328NQe {
    public final N0R LJLIL;
    public C58986NDa LJLILLLLZI;
    public long LJLJI;

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
    }

    public final void LIZ() {
        NDZ.LIZIZ.LJFF = false;
        C58986NDa c58986NDa = this.LJLILLLLZI;
        if (c58986NDa != null) {
            c58986NDa.setVisibility(8);
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS view = c58986NDa.getView();
            if (view != null) {
                KR3.LIZIZ(view, "IBEHide", new OSZ[0]);
            }
        }
    }

    @Override // X.InterfaceC59328NQe
    public final void LJJJJJL() {
        NDZ.LIZIZ.LJFF();
    }

    @Override // X.InterfaceC59328NQe
    public final void LJJJJZI() {
        NDZ.LIZIZ.LJ();
    }

    @Override // X.InterfaceC59328NQe
    public final void eb() {
        LIZ();
        NDR ndr = NDR.LJI;
        NDZ.LIZIZ.LIZLLL();
        NDZ.LIZIZ = ndr;
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ N0R L9() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC59328NQe
    public final void g10() {
        LIZ();
    }

    public NDX(C59119NId c59119NId) {
        this.LJLIL = c59119NId;
    }

    public static long LIZIZ(Aweme aweme) {
        double d = 1000;
        if (aweme.getVideo().getDuration() <= O6R.LJJIJ(IBEConfigSettings.LIZ().ibeHideTime * d)) {
            return 0L;
        }
        return O6R.LJJIJ(IBEConfigSettings.LIZ().ibeShowTime * d);
    }

    public final void LIZJ(View view) {
        o.LJIIIZ(view, "view");
        this.LJLILLLLZI = (C58986NDa) view.findViewById(R.id.d6j);
    }

    @Override // X.InterfaceC59328NQe
    public final void jJ(Aweme aweme) {
        boolean z;
        List<IBEInfo> ibeInfos;
        IBEInfo iBEInfo;
        Object LIZ;
        String LJJIJIIJI;
        if (aweme != null) {
            if (o.LJ(aweme.getAid(), NDZ.LIZIZ.LIZ) && System.currentTimeMillis() - this.LJLJI < 500) {
                z = true;
            } else {
                z = false;
            }
            this.LJLJI = System.currentTimeMillis();
            if (z) {
                return;
            }
            CommercialVideoInfo LJIIZILJ = C1DF.LJIIZILJ(aweme);
            InteractiveBrandedEffectInfo interactiveBrandedEffectInfo = null;
            if (LJIIZILJ == null || (ibeInfos = LJIIZILJ.getIbeInfos()) == null || (iBEInfo = (IBEInfo) ORZ.LLFII(ibeInfos)) == null) {
                NDR ndr = NDR.LJI;
                NDZ.LIZIZ.LIZLLL();
                NDZ.LIZIZ = ndr;
                return;
            }
            InteractiveBrandedEffectInfo ibeMetaInfo = LJIIZILJ.getIbeMetaInfo();
            if (ibeMetaInfo == null) {
                InterfaceC46330IGg LJJLIIIIJ = IWF.LJJLIIIIJ();
                if (LJJLIIIIJ != null && (((LJJIJIIJI = LJJLIIIIJ.LJJIJIIJI("information")) != null || (LJJIJIIJI = LJJLIIIIJ.LJJIJIIJI("com.android.information")) != null || (LJJIJIIJI = LJJLIIIIJ.LJJIJIIJI("com.apple.quicktime.information")) != null) && !TextUtils.isEmpty(LJJIJIIJI))) {
                    try {
                        JSONObject jSONObject = new JSONObject(JSONObjectProtectorUtils.getString(new JSONObject(LJJIJIIJI), "com.bytedance.info"));
                        if (jSONObject.has("interactive_branded_effect_infos")) {
                            ArrayList arrayList = (ArrayList) GsonHolder.LIZLLL().LIZ().LJII(JSONObjectProtectorUtils.getString(jSONObject, "interactive_branded_effect_infos"), new C42483Glr().getType());
                            if (arrayList != null && !arrayList.isEmpty()) {
                                interactiveBrandedEffectInfo = (InteractiveBrandedEffectInfo) ORZ.LLFF(arrayList);
                            }
                        }
                    } catch (Exception e) {
                        C78983UzD.LJIIZILJ(e);
                    }
                }
                ibeMetaInfo = interactiveBrandedEffectInfo;
            }
            if (ibeMetaInfo == null) {
                C78983UzD.LJIILLIIL("Found IBEInfo in Aweme but no metadata in video.", C113554cx.LJJL(new OSZ("prop_id", iBEInfo.getPropId()), new OSZ("video_id", aweme.getAid())));
                return;
            }
            this.LJLIL.LIZ().LJLIIL();
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
            NDP ndp = new NDP(aid, ibeMetaInfo);
            NDZ.LIZIZ.LIZLLL();
            NDZ.LIZIZ = ndp;
            ndp.LJII();
            InteractiveBrandedEffectInfo interactiveBrandedEffectInfo2 = NDZ.LIZIZ.LIZIZ;
            if (interactiveBrandedEffectInfo2 == null) {
                return;
            }
            String lynxSchema = iBEInfo.getLynxSchema();
            o.LJIIIZ(lynxSchema, "lynxSchema");
            HashMap<String, Integer> hashMap = C58628Mzg.LJIIIIZZ;
            Integer num = hashMap.get(lynxSchema);
            if (num == null) {
                num = 0;
            }
            hashMap.put(lynxSchema, Integer.valueOf(num.intValue() + 1));
            C58628Mzg c58628Mzg = new C58628Mzg(aweme, iBEInfo, new ETC(0, null, null, null, false, 15), this.LJLIL);
            N0X.LIZ.getClass();
            c58628Mzg.LIZIZ(N0X.LIZIZ);
            LIZLLL(aweme, "ibeShouldShow", LIZIZ(aweme), true, new AqS160S0100000_10(c58628Mzg, 13));
            try {
                LIZ = NDZ.LIZ.LIZJ(iBEInfo.getLynxSchema());
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl == null) {
                LJ((SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) LIZ, interactiveBrandedEffectInfo2, c58628Mzg, aweme);
                return;
            }
            c58628Mzg.LJIIJ(new ETC(0, null, null, EnumC59048NFk.RETRY.getValue(), false, 23));
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ == null) {
                return;
            }
            CommerceIBEService.LJFF().LIZLLL(iBEInfo, LJIIIIZZ, c58628Mzg, new AqS56S0400000_10(this, interactiveBrandedEffectInfo2, c58628Mzg, aweme, 0), new AqS157S0200000_10(m10exceptionOrNullimpl, c58628Mzg, 2));
        }
    }

    public final void LJ(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, InteractiveBrandedEffectInfo interactiveBrandedEffectInfo, C58628Mzg c58628Mzg, Aweme aweme) {
        NDW ndw = NDZ.LIZIZ;
        ndw.LJ = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        LIZLLL(aweme, "ibeShow", LIZIZ(aweme), false, new NDY(this, sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, interactiveBrandedEffectInfo, c58628Mzg, aweme, ndw.LIZ));
    }

    public final void LIZLLL(Aweme aweme, String str, long j, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        VideoPlayTaskManager LIZ = this.LJLIL.LIZ();
        N68 n68 = new N68(str);
        n68.LIZJ = (int) j;
        n68.LIZIZ(aweme.getVideo().getDuration());
        n68.LJ = false;
        n68.LJFF = z;
        n68.LIZLLL = new ARunnableS46S0100000_10((InterfaceC65784Pro) interfaceC65784Pro, 7);
        LIZ.LJLJLJ(n68.LIZ());
    }
}
