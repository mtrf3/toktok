package X;

import Y.ARunnableS46S0100000_10;
import android.os.Handler;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.ad.feed.ibe.setting.IBEConfigSettings;
import com.ss.android.ugc.aweme.commerce.InteractiveBrandedEffectInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS77S1100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NDY extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ NDX LJLIL;
    public final /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLILLLLZI;
    public final /* synthetic */ InteractiveBrandedEffectInfo LJLJI;
    public final /* synthetic */ C58628Mzg LJLJJI;
    public final /* synthetic */ Aweme LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NDY(NDX ndx, SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, InteractiveBrandedEffectInfo interactiveBrandedEffectInfo, C58628Mzg c58628Mzg, Aweme aweme, String str) {
        super(0);
        this.LJLIL = ndx;
        this.LJLILLLLZI = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        this.LJLJI = interactiveBrandedEffectInfo;
        this.LJLJJI = c58628Mzg;
        this.LJLJJL = aweme;
        this.LJLJJLL = str;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Object obj;
        boolean z;
        boolean z2;
        boolean z3;
        NDX ndx = this.LJLIL;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS view = this.LJLILLLLZI;
        InteractiveBrandedEffectInfo interactiveBrandedEffectInfo = this.LJLJI;
        C58628Mzg c58628Mzg = this.LJLJJI;
        Aweme aweme = this.LJLJJL;
        ndx.getClass();
        NDZ.LIZIZ.LJFF = true;
        C58993NDh c58993NDh = NDZ.LIZ;
        c58993NDh.getClass();
        o.LJIIIZ(view, "view");
        ConcurrentHashMap<String, List<C58991NDf>> concurrentHashMap = c58993NDh.LIZ;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, List<C58991NDf>>> it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ORS.LJJLIIIJILLIZJL(it.next().getValue(), arrayList);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (o.LJ(((C58991NDf) obj).LIZ, view)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C58991NDf c58991NDf = (C58991NDf) obj;
        if (c58991NDf != null) {
            synchronized (c58991NDf) {
                c58991NDf.LJFF = EnumC58992NDg.USING;
            }
        }
        C58986NDa c58986NDa = ndx.LJLILLLLZI;
        if (c58986NDa != null) {
            c58986NDa.setView(view);
            c58986NDa.setVisibility(0);
            if (interactiveBrandedEffectInfo.getEnableTap()) {
                if (NDZ.LIZIZ.LIZJ == 1) {
                    z = true;
                } else {
                    z = false;
                }
                c58986NDa.setInterceptTouchEvent(z);
                if (NDZ.LIZIZ.LIZJ == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c58986NDa.setEnabled(z2);
                if (NDZ.LIZIZ.LIZJ == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c58986NDa.setClickable(z3);
            }
            if (interactiveBrandedEffectInfo.getEnableShake()) {
                c58986NDa.setInterceptTouchEvent(true);
                c58986NDa.setEnabled(false);
                c58986NDa.setClickable(false);
            }
        }
        N0X.LIZ.getClass();
        c58628Mzg.LIZIZ(N0X.LJII);
        OSZ[] oszArr = new OSZ[8];
        oszArr[0] = new OSZ("prop_data", interactiveBrandedEffectInfo.getPropData());
        oszArr[1] = new OSZ("brand_extra", interactiveBrandedEffectInfo.getBrandExtra());
        oszArr[2] = new OSZ("scale_mode", 0);
        oszArr[3] = new OSZ("did_finish", Integer.valueOf(NDZ.LIZIZ.LIZJ));
        InterfaceC58651N0d interfaceC58651N0d = (InterfaceC58651N0d) C59835Ne3.LJIIJ.LIZ();
        if (interfaceC58651N0d != null) {
            oszArr[4] = new OSZ("client_extra", GsonProtectorUtils.toJson(interfaceC58651N0d.LIZ(), interactiveBrandedEffectInfo.getVideoInterval()));
            oszArr[5] = new OSZ("sticker_id", interactiveBrandedEffectInfo.getStickerId());
            oszArr[6] = new OSZ("enter_from", ndx.LJLIL.getEventType());
            oszArr[7] = new OSZ("video_id", aweme.getAid());
            KR3.LIZIZ(view, "IBEShow", oszArr);
            NDX ndx2 = this.LJLIL;
            Aweme aweme2 = this.LJLJJL;
            ndx2.getClass();
            long duration = aweme2.getVideo().getDuration();
            double d = 1000;
            long LJJIJ = O6R.LJJIJ(IBEConfigSettings.LIZ().ibeHideTime * d);
            long LJJIJ2 = O6R.LJJIJ(IBEConfigSettings.LIZ().ibeHideTime * d);
            if (duration <= LJJIJ) {
                LJJIJ2 -= O6R.LJJIJ(IBEConfigSettings.LIZ().ibeShowTime * d);
            }
            NDX ndx3 = this.LJLIL;
            Aweme aweme3 = this.LJLJJL;
            ndx3.getClass();
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS46S0100000_10((InterfaceC65784Pro) new AqS77S1100000_10(this.LJLJJLL, this.LJLIL, 0), 7), LJJIJ2 - NDX.LIZIZ(aweme3));
            return C76800UCe.LIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
