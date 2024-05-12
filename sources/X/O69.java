package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity;
import com.ss.android.ugc.aweme.kids.recommendfeed.RecommendFeedServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS16S0200000_7;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O69 implements O6C {
    public final /* synthetic */ KidsMainActivity LIZ;

    public O69(KidsMainActivity kidsMainActivity) {
        this.LIZ = kidsMainActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.O6C
    public final void LIZ(String lastTabName, String toTabName) {
        O6B o6b;
        O6B o6b2;
        String logPbString;
        O6B o6b3;
        o.LJIIIZ(lastTabName, "lastTabName");
        o.LJIIIZ(toTabName, "toTabName");
        String str = null;
        if (TextUtils.equals(lastTabName, toTabName)) {
            KidsMainActivity kidsMainActivity = this.LIZ;
            kidsMainActivity.getClass();
            if (!o.LJ(toTabName, "homepage_hot")) {
                return;
            }
            InterfaceC36571c5 Ja = kidsMainActivity.Ja(toTabName);
            if (!(Ja instanceof O6B) || (o6b3 = (O6B) Ja) == null) {
                return;
            }
            o6b3.sk();
            return;
        }
        if (o.LJ(toTabName, "tab_publish")) {
            KidsMainActivity kidsMainActivity2 = this.LIZ;
            O6D o6d = (O6D) kidsMainActivity2._$_findCachedViewById(R.id.e6c);
            o6d.getClass();
            if (C6ZT.LIZ(o6d.LJLL.get("tab_publish"))) {
                return;
            }
            Aweme LIZ = RecommendFeedServiceImpl.LIZJ().LIZ();
            C39398FdC c39398FdC = C39398FdC.LIZ;
            C198517qh c198517qh = new C198517qh();
            c198517qh.LIZ.put("shoot_way", "direct_shoot");
            if (LIZ != null) {
                str = LIZ.getAid();
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            c198517qh.LIZ.put("group_id", str);
            if (LIZ != null && (logPbString = LIZ.getLogPbString()) != null) {
                str2 = logPbString;
            }
            C39398FdC.LIZIZ("shoot", q.LIZJ(c198517qh.LIZ, "log_pb", str2, c198517qh, c39398FdC));
            String uuid = UUID.randomUUID().toString();
            o.LJIIIIZZ(uuid, "randomUUID().toString()");
            RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.shootWay("direct_shoot");
            builder.creationId(uuid);
            AVExternalServiceImpl.LIZ().asyncServiceForMainRecordService(kidsMainActivity2, "direct_shoot", new IDLCallbackS16S0200000_7(kidsMainActivity2, builder, 12));
            return;
        }
        KidsMainActivity kidsMainActivity3 = this.LIZ;
        if (kidsMainActivity3.isFinishing() || TextUtils.equals(lastTabName, toTabName)) {
            return;
        }
        try {
            Fragment Ja2 = kidsMainActivity3.Ja(lastTabName);
            Fragment Ja3 = kidsMainActivity3.Ja(toTabName);
            FragmentManager fragmentManager = kidsMainActivity3.getFragmentManager();
            fragmentManager.getClass();
            C1B3 c1b3 = new C1B3(fragmentManager);
            if (kidsMainActivity3.getFragmentManager().LJJJJIZL() > 0) {
                kidsMainActivity3.getFragmentManager().LJJLIIIJJI();
            }
            if (!Ja3.isAdded()) {
                c1b3.LJIIIZ(Ja2);
                c1b3.LJIIIIZZ(R.id.bs8, 1, Ja3, toTabName);
                c1b3.LJI();
            } else {
                c1b3.LJIIIZ(Ja2);
                c1b3.LJIIL(Ja3);
                c1b3.LJI();
            }
            if (TextUtils.equals(lastTabName, "liked")) {
                c1b3.LJJI(Ja2);
            }
            if (TextUtils.equals(lastTabName, "homepage_hot") && (Ja2 instanceof O6B) && (o6b2 = (O6B) Ja2) != null) {
                o6b2.vf(true);
            }
            if (TextUtils.equals(toTabName, "homepage_hot") && (Ja3 instanceof O6B) && (o6b = (O6B) Ja3) != null) {
                o6b.b5(true);
            }
            kidsMainActivity3.LJLJI = toTabName;
            kidsMainActivity3.LLFII();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
