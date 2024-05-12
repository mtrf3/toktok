package X;

import Y.AfS52S0200000_3;
import Y.AfS55S0100000_3;
import Y.AfS9S1101000_3;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionAgent;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.aweme.utils.Au2S14S0100000_3;
import com.ss.android.ugc.aweme.utils.Au2S9S0300000_3;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.7hq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193027hq implements InterfaceC192527h2 {
    public final ActivityC45651qj LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final C193047hs LJLJJI;
    public String LJLJJL;
    public C191997gB LJLJJLL;

    public final void LIZIZ(View contentView) {
        String string;
        o.LJIIIZ(contentView, "contentView");
        View decorView = this.LJLIL.getWindow().getDecorView();
        o.LJIIIIZZ(decorView, "activity.window.decorView");
        int LIZJ = C47959Irz.LIZJ(12, C47959Irz.LIZJ(60, C73098SmU.LIZJ(decorView).bottom - C73098SmU.LIZJ(contentView).bottom));
        C34K c34k = new C34K();
        C76732zl c76732zl = new C76732zl();
        AKT akt = new AKT(this.LJLIL);
        akt.LJ(R.style.ux);
        akt.LIZ.LJLILLLLZI = 0;
        akt.LIZJ(3000L);
        akt.LIZ.LJLJL = LIZJ;
        Keva keva = new C192487gy().LIZJ.LJLIL.LIZIZ;
        if (keva == null || (string = keva.getString("CollectionCache", "")) == null || string.length() == 0) {
            akt.LIZ.LJLJLJ = new Au2S14S0100000_3(this, 8);
        } else {
            C192987hm.LIZ(new C192487gy().LIZJ, true).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS52S0200000_3(c76732zl, c34k, 6), new InterfaceC64592gB() { // from class: X.7ht
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
            akt.LIZ.LJLJLJ = new Au2S9S0300000_3((Object) this, (CollectionContentFragment) c34k, (List<C192217gX>) c76732zl, (ActivityC45651qj) 0);
        }
        M8L.LIZ("popup favorite toast");
        C193077hv c193077hv = new C193077hv(this.LJLILLLLZI);
        c193077hv.LJLILLLLZI = akt;
        if (C52535Kjb.LIZ()) {
            if (C52535Kjb.LIZIZ()) {
                AwemeCollectionAgent.LJIILLIIL().LJFF(c193077hv.LJLJI);
            } else {
                AwemeCollectionAgent.LJIILLIIL().LJI(c193077hv);
            }
        }
        EventBus.LIZJ().LJIILJJIL(c193077hv);
        akt.LJFF(R.string.gb7);
        akt.LJ(R.style.ux);
        akt.LIZ.LJLJJI = 2;
        akt.LIZLLL(R.string.gaq);
        akt.LIZIZ(new AqS153S0100000_3(c193077hv, 270));
        akt.LJII();
    }

    public final void LIZJ(ActivityC45651qj activityC45651qj) {
        C192637hD c192637hD = new C192637hD();
        c192637hD.LIZLLL = this.LJLJI;
        c192637hD.LJIILIIL();
        FragmentManager supportFragmentManager = this.LJLIL.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        String string = activityC45651qj.getString(R.string.gb5);
        o.LJIIIIZZ(string, "context.getString(R.string.fc_add_sheet_title)");
        String string2 = activityC45651qj.getString(R.string.q8h);
        o.LJIIIIZZ(string2, "context.getString(R.string.save)");
        C193227iA.LIZJ(supportFragmentManager, string, string2, new InterfaceC193237iB() { // from class: X.7h3
            @Override // X.InterfaceC193237iB
            public final void LIZ(int i, String s) {
                o.LJIIIZ(s, "s");
                C73454SsE LJJJ = new C192487gy().LIZJ.LJJJIL(new CollectionManageRequest(1, null, s, null, null, null, null, null, Integer.valueOf(i), LiveCoverMinSizeSetting.DEFAULT, null)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
                C193027hq c193027hq = C193027hq.this;
                LJJJ.LJJJLIIL(new AfS9S1101000_3(c193027hq, i, s, 0), new AfS55S0100000_3(c193027hq, 20));
            }
        });
    }

    @QD3
    public final void onCollectAwemeEvent(C193087hw e) {
        o.LJIIIZ(e, "e");
        if (e.LJLILLLLZI == 1) {
            if (o.LJ(e.LJLIL, this.LJLILLLLZI)) {
                C191997gB c191997gB = this.LJLJJLL;
                if (c191997gB != null) {
                    c191997gB.invoke();
                }
                this.LJLJJL = e.LJLIL;
            }
            this.LJLJJLL = null;
            if (EventBus.LIZJ().LJI(this)) {
                EventBus.LIZJ().LJIJ(this);
            }
        }
    }

    public final void LIZ(boolean z, CollectionDetail collectionDetail) {
        M8L.LIZ("popup add video to collection toast");
        CollectionManageRequest collectionManageRequest = new CollectionManageRequest(10, collectionDetail.id, null, null, null, C47261Igj.LJJIJ(this.LJLILLLLZI), null, null, null, 476, null);
        C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
        String string = this.LJLIL.getString(R.string.gb6);
        o.LJIIIIZZ(string, "activity.getString(R.str…oast_added_to_collection)");
        String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{collectionDetail.name}, 1));
        o.LJIIIIZZ(LLLZ, "format(this, *args)");
        c26045AKb.LJIIIZ(LLLZ);
        c26045AKb.LJFF(R.raw.icon_tick_fill_small);
        c26045AKb.LJII(R.attr.e8);
        c26045AKb.LJIIJ();
        C191997gB c191997gB = new C191997gB(collectionManageRequest, z, this, collectionDetail);
        if (o.LJ(this.LJLJJL, this.LJLILLLLZI)) {
            c191997gB.invoke();
        } else {
            this.LJLJJLL = c191997gB;
        }
    }

    public C193027hq(ActivityC45651qj activity, String awemeId, String enterFrom) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = activity;
        this.LJLILLLLZI = awemeId;
        this.LJLJI = enterFrom;
        C193047hs c193047hs = new C193047hs(this);
        this.LJLJJI = c193047hs;
        if (C52535Kjb.LIZ()) {
            if (C52535Kjb.LIZIZ()) {
                AwemeCollectionAgent.LJIILLIIL().LJFF(c193047hs);
            } else {
                AwemeCollectionAgent.LJIILLIIL().LJI(this);
            }
        }
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // X.AnonymousClass885
    public final void id(String str, Boolean bool, EnumC2063587z enumC2063587z) {
        C192517h1.LIZ(this, str, bool.booleanValue(), enumC2063587z);
    }

    @Override // X.InterfaceC192527h2
    public final void u8(String id, boolean z, EnumC2063587z source) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(source, "source");
        if (source == EnumC2063587z.MUTATION && z) {
            if (o.LJ(id, this.LJLILLLLZI)) {
                C191997gB c191997gB = this.LJLJJLL;
                if (c191997gB != null) {
                    c191997gB.invoke();
                }
                this.LJLJJL = id;
            }
            this.LJLJJLL = null;
            AwemeCollectionAgent.LJIILLIIL().LJIIIIZZ(this);
        }
    }
}
