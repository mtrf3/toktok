package com.ss.android.ugc.aweme.casting.ui.playback.feed;

import X.ActivityC45651qj;
import X.C1DH;
import X.C2053083y;
import X.C212428Vi;
import X.C2K0;
import X.C36636EZk;
import X.C3C8;
import X.C71042qa;
import X.C71082qe;
import X.C71112qh;
import X.C72083SQt;
import X.C76800UCe;
import X.C779634e;
import X.C780334l;
import X.C781334v;
import X.C78688UuS;
import X.C8T7;
import X.EF7;
import X.InterfaceC55102Lju;
import X.InterfaceC65784Pro;
import X.XKQ;
import X.XKX;
import Y.ARunnableS20S0200000_1;
import Y.ARunnableS37S0100000_1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.byted.cast.common.source.ServiceInfo;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class InteractInfoTVCastAssem extends BaseCellSlotComponent implements InteractAreaAttachAbility, ComponentPriorityProtocol, InterfaceC55102Lju {
    public C781334v LLFII;
    public XKQ LLFZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.vi;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "left_container_cast_play_control";
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 532206958) {
            return null;
        }
        return this;
    }

    public InteractInfoTVCastAssem() {
        new LinkedHashMap();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void e4() {
        XKQ xkq = this.LLFZ;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe == null) {
            this.LLFZ = XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C71112qh(this, view, null), 2);
        } else {
            q4(view, c71082qe);
        }
    }

    @Override // X.C8XO
    /* renamed from: r4, reason: merged with bridge method [inline-methods] */
    public final void q4(VideoItemParams item) {
        Fragment LIZLLL;
        ActivityC45651qj LIZ;
        Window window;
        View decorView;
        String str;
        String str2;
        o.LJIIIZ(item, "item");
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe == null) {
            return;
        }
        String str3 = null;
        if (c71082qe.LIZIZ.LJIIIZ() && C78688UuS.LJJJJJ(item.getAweme())) {
            long currentTimeMillis = System.currentTimeMillis();
            getContainerView().setVisibility(0);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            Aweme aweme = c71082qe.LIZJ.LIZIZ;
            if (aweme != null) {
                str = aweme.getGroupId();
            } else {
                str = null;
            }
            Aweme aweme2 = c71082qe.LIZJ.LIZIZ;
            if (aweme2 != null) {
                str2 = aweme2.getAuthorUid();
            } else {
                str2 = null;
            }
            C779634e.LIZIZ(c71082qe.LIZJ.LIZJ, str, str2, c71082qe.LIZIZ.LJIIIIZZ(), Integer.valueOf(EF7.LJIIIZ), currentTimeMillis2);
        } else {
            getContainerView().setVisibility(8);
        }
        C781334v c781334v = this.LLFII;
        if (c781334v != null) {
            ServiceInfo value = c71082qe.LIZIZ.LJIIIIZZ.getValue();
            if (value != null) {
                str3 = value.name;
            }
            c781334v.setConnectedDeviceName(str3);
        }
        if (c71082qe.LIZIZ.LJIIIZ() && !C72083SQt.LJLIIIL(item.getAweme()) && (LIZLLL = C212428Vi.LIZLLL(this)) != null && LIZLLL.isAdded() && (LIZ = C212428Vi.LIZ(this)) != null && (window = LIZ.getWindow()) != null && (decorView = window.getDecorView()) != null && (decorView instanceof ViewGroup)) {
            C1DH.LJJIJIIJI(new ARunnableS37S0100000_1(decorView, 21));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void Sn(ReusedUIAssem<? extends C3C8> reusedUIAssem, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C2053083y.LIZ(reusedUIAssem, interfaceC65784Pro);
    }

    public final void q4(View view, C71082qe c71082qe) {
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        this.LLFII = new C781334v(context, true);
        C1DH.LJJIJIIJI(new ARunnableS20S0200000_1(this, c71082qe, 5));
    }
}
