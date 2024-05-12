package X;

import Y.IDCListenerS135S0100000;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.OnLiveEffectSelectedEvent;
import com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.10q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C260810q {
    public final DataChannel LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public final InterfaceC31981Ni LJFF;
    public final C44191oN LJI;
    public InterfaceC65784Pro<C76800UCe> LJII;
    public InterfaceC88472Yns<? super LiveEffect, C76800UCe> LJIIIIZZ;
    public final View LJIIIZ;
    public final RunnableC31065CHd LJIIJ;
    public final C47121t6 LJIIJJI;
    public final LiveSmallItemBeautyViewModel LJIIL;
    public boolean LJIILIIL;

    public C260810q(ViewGroup parentView, DataChannel dataChannel, String str, String str2, String parentEffectId, String str3, String effectPanelNameEnum, InterfaceC31981Ni composerManagerB) {
        o.LJIIIZ(parentView, "parentView");
        o.LJIIIZ(parentEffectId, "parentEffectId");
        o.LJIIIZ(effectPanelNameEnum, "effectPanelNameEnum");
        o.LJIIIZ(composerManagerB, "composerManagerB");
        this.LIZ = dataChannel;
        this.LIZIZ = str;
        this.LIZJ = parentEffectId;
        this.LIZLLL = str3;
        this.LJ = effectPanelNameEnum;
        this.LJFF = composerManagerB;
        C44191oN c44191oN = new C44191oN();
        this.LJI = c44191oN;
        View inflate = ((ViewStub) parentView.findViewById(R.id.kn_)).inflate();
        this.LJIIIZ = inflate;
        parentView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        View findViewById = inflate.findViewById(R.id.k5o);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.…item_beauty_recycle_view)");
        RunnableC31065CHd runnableC31065CHd = (RunnableC31065CHd) findViewById;
        this.LJIIJ = runnableC31065CHd;
        View findViewById2 = inflate.findViewById(R.id.hib);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.parent_effect_name)");
        C47121t6 c47121t6 = (C47121t6) findViewById2;
        this.LJIIJJI = c47121t6;
        View findViewById3 = inflate.findViewById(R.id.aej);
        o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.id.back_btn)");
        this.LJIIL = (LiveSmallItemBeautyViewModel) new ViewModelProvider(C30686C2o.LJLIL, new C37301dG(new C44171oL(0))).get(LiveSmallItemBeautyViewModel.class);
        this.LJIILIIL = true;
        c44191oN.LJLJI = new InterfaceC261310v() { // from class: X.1cX
            @Override // X.InterfaceC261310v
            public final void LIZ(LiveEffect liveEffect) {
                o.LJIIIZ(liveEffect, "liveEffect");
                C0TX.LIZ.LIZJ("LiveSmallSubItemBeautyFragment");
                C0TX.LIZIZ(String.valueOf(liveEffect));
                C260810q.this.getClass();
                DataChannel dataChannel2 = C260810q.this.LIZ;
                if (dataChannel2 != null) {
                    dataChannel2.qv0(OnLiveEffectSelectedEvent.class, liveEffect);
                }
            }
        };
        runnableC31065CHd.setAdapter(c44191oN);
        runnableC31065CHd.setLayoutManager(linearLayoutManager);
        runnableC31065CHd.LJII(new C1UY(), -1);
        runnableC31065CHd.setItemAnimator(null);
        runnableC31065CHd.setHasFixedSize(true);
        c47121t6.setText(this.LIZLLL);
        C16880lQ.LJJII((LiveIconView) findViewById3, new IDCListenerS135S0100000(this, 84));
    }
}
