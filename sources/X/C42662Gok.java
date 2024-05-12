package X;

import Y.ARunnableS26S0200000_7;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tux.sheet.BaseSheet;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gok, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42662Gok {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LJ(Context context, Bundle bundle) {
        o.LJIIIZ(context, "context");
        C139895eL.LIZIZ = false;
        if (bundle == null) {
            bundle = new Bundle();
        }
        LIZLLL(context, bundle, "VideoEditContainerScene", null, 24);
    }

    public static final void LJFF(Context context, Bundle bundle) {
        o.LJIIIZ(context, "context");
        if (bundle == null) {
            bundle = new Bundle();
        }
        int i = bundle.getInt("extra_request_code", 1002);
        C139895eL.LIZIZ = false;
        LIZLLL(context, bundle, "VideoEditContainerScene", Integer.valueOf(i), 16);
    }

    public static final void LIZJ(Context context, Bundle bundle, Integer num) {
        o.LJIIIZ(context, "context");
        if (bundle == null) {
            bundle = new Bundle();
        }
        LIZLLL(context, bundle, "VideoPublishContainerScene", num, 16);
    }

    public static final void LIZ(SAAActivity activity, String str, Bundle bundle, C42663Gol c42663Gol) {
        NavigationScene navigationScene;
        String str2;
        AbstractC42651GoZ abstractC42651GoZ;
        o.LJIIIZ(activity, "activity");
        AbstractC42651GoZ LLIIIILZ = activity.LLIIIILZ();
        if (LLIIIILZ == null || (navigationScene = activity.LJLJJLL) == null) {
            return;
        }
        WMH LJFF = C60903NvH.LJIIJJI().LJIL().LJFF(str);
        o.LJII(LJFF, "null cannot be cast to non-null type com.ss.android.ugc.aweme.adaptation.TikTokSAARootGroupScene");
        AbstractC42651GoZ abstractC42651GoZ2 = (AbstractC42651GoZ) LJFF;
        Bundle LIZ2 = C43573H8f.LIZ(bundle);
        int i = GBV.LIZ[abstractC42651GoZ2.LJLIL.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                List<WM7> sceneList = navigationScene.getSceneList();
                ArrayList arrayList = (ArrayList) sceneList;
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    WM7 wm7 = (WM7) it.next();
                    if ((wm7 instanceof AbstractC42651GoZ) && wm7 != null) {
                        str2 = wm7.getClass().getName();
                    } else {
                        str2 = null;
                    }
                    if (o.LJ(str2, abstractC42651GoZ2.getClass().getName())) {
                        if (i2 >= 0) {
                            Object LJLLLLLL = ORZ.LJLLLLLL(i2, sceneList);
                            if ((LJLLLLLL instanceof AbstractC42651GoZ) && (abstractC42651GoZ = (AbstractC42651GoZ) LJLLLLLL) != null && abstractC42651GoZ.LLJLIL(LIZ2)) {
                                Class<?> cls = abstractC42651GoZ2.getClass();
                                C1JI.LJII();
                                if (!C78932UyO.LJ(navigationScene.mActivity)) {
                                    return;
                                }
                                navigationScene.LLJJIJI();
                                WMI wmi = navigationScene.LJLJJI;
                                wmi.getClass();
                                wmi.LJIIIIZZ(new WMN(wmi, cls));
                                return;
                            }
                            LIZIZ(activity, abstractC42651GoZ2, LIZ2, c42663Gol, navigationScene, new C42665Gon(arrayList.size() - i2));
                            return;
                        }
                    } else {
                        i2++;
                    }
                }
                LIZIZ(activity, abstractC42651GoZ2, LIZ2, c42663Gol, navigationScene, null);
                return;
            }
            if (!o.LJ(LLIIIILZ.getClass().getName(), abstractC42651GoZ2.getClass().getName())) {
                LIZIZ(activity, abstractC42651GoZ2, LIZ2, c42663Gol, navigationScene, null);
                return;
            } else {
                if (LLIIIILZ.LLJLIL(LIZ2)) {
                    return;
                }
                LIZIZ(activity, abstractC42651GoZ2, LIZ2, c42663Gol, navigationScene, new C42666Goo());
                return;
            }
        }
        LIZIZ(activity, abstractC42651GoZ2, LIZ2, c42663Gol, navigationScene, null);
    }

    public static void LIZLLL(Context context, Bundle bundle, String str, Integer num, int i) {
        if ((i & 8) != 0) {
            num = null;
        }
        o.LJIIIZ(context, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ instanceof SAAActivity) {
            if (num != null) {
                C42663Gol c42663Gol = new C42663Gol();
                SAAActivity sAAActivity = (SAAActivity) LJIJJ;
                c42663Gol.LIZIZ = new C42656Goe(sAAActivity.LLIIIILZ(), num);
                LIZ(sAAActivity, str, bundle, c42663Gol);
                return;
            }
            LIZ((SAAActivity) LJIJJ, str, bundle, null);
            return;
        }
        Intent intent = new Intent(context, (Class<?>) SAAActivity.class);
        intent.putExtras(bundle);
        intent.putExtra("creative_saa_page", str);
        if (num != null) {
            C42326GjK c42326GjK = C42326GjK.LIZ;
            Activity LJIJJ2 = C45804HyK.LJIJJ(context);
            if (LJIJJ2 != null) {
                int intValue = num.intValue();
                c42326GjK.getClass();
                C42326GjK.LJFF(LJIJJ2, intValue, intent);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        C42326GjK.LIZ.getClass();
        C42326GjK.LJ(context, intent);
    }

    public static final void LIZIZ(SAAActivity sAAActivity, AbstractC42651GoZ abstractC42651GoZ, Bundle bundle, C42663Gol c42663Gol, NavigationScene navigationScene, InterfaceC42667Gop<WM7> interfaceC42667Gop) {
        Integer num;
        WMU c82161WMj;
        Integer enterResId;
        Integer exitResId;
        List<Fragment> LJJJJLI = sAAActivity.getSupportFragmentManager().LJJJJLI();
        o.LJIIIIZZ(LJJJJLI, "activity.supportFragmentManager.fragments");
        ArrayList arrayList = new ArrayList();
        for (Fragment fragment : LJJJJLI) {
            if ((fragment instanceof BaseSheet) || (fragment instanceof SparkPopup)) {
                arrayList.add(fragment);
            }
        }
        if (!arrayList.isEmpty()) {
            FragmentManager supportFragmentManager = sAAActivity.getSupportFragmentManager();
            C1B3 LIZ2 = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                LIZ2.LJJI((Fragment) it.next());
            }
            LIZ2.LJII();
        }
        abstractC42651GoZ.mArguments = bundle;
        if (c42663Gol == null) {
            c42663Gol = new C42663Gol();
        }
        OSZ LJ = U1F.LJ(abstractC42651GoZ.LLJJIJI());
        Integer num2 = (Integer) LJ.getFirst();
        if (num2 == null || num2.intValue() != 0 || (num = (Integer) LJ.getSecond()) == null || num.intValue() != 0) {
            Integer num3 = (Integer) LJ.getFirst();
            if (num3 == null || num3.intValue() != 0) {
                enterResId = (Integer) LJ.getFirst();
            } else {
                enterResId = Integer.valueOf(R.anim.bd);
            }
            Integer num4 = (Integer) LJ.getSecond();
            if (num4 == null || num4.intValue() != 0) {
                exitResId = (Integer) LJ.getSecond();
            } else {
                exitResId = Integer.valueOf(R.anim.bd);
            }
            o.LJIIIIZZ(enterResId, "enterResId");
            int intValue = enterResId.intValue();
            o.LJIIIIZZ(exitResId, "exitResId");
            c82161WMj = new WN4(intValue, exitResId.intValue(), sAAActivity);
        } else {
            c82161WMj = new C82161WMj();
        }
        c82161WMj.LIZIZ = new ARunnableS26S0200000_7(c82161WMj, abstractC42651GoZ, 30);
        c42663Gol.LIZJ = c82161WMj;
        c42663Gol.LIZ = true;
        c42663Gol.LIZLLL = interfaceC42667Gop;
        navigationScene.LLJJJJ(abstractC42651GoZ, c42663Gol.LIZ());
    }
}
