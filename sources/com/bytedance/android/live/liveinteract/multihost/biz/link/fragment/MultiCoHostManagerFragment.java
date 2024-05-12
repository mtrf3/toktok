package com.bytedance.android.live.liveinteract.multihost.biz.link.fragment;

import X.AbstractC75839Tpb;
import X.B5G;
import X.C0NB;
import X.C15380j0;
import X.C16880lQ;
import X.C221108m2;
import X.C29306Beo;
import X.C30868C9o;
import X.C31413CUn;
import X.C44432HcC;
import X.C47121t6;
import X.C62822Ol8;
import X.C75475Tjj;
import X.C75633TmH;
import X.C75642TmQ;
import X.C75648TmW;
import X.C75764ToO;
import X.C75883TqJ;
import X.C76265TwT;
import X.C76800UCe;
import X.C79045V0n;
import X.C81185Vtd;
import X.C86881Y7x;
import X.CJ2;
import X.EnumC75763ToN;
import X.EnumC76178Tv4;
import X.EnumC76391TyV;
import X.InterfaceC75451TjL;
import X.InterfaceC75477Tjl;
import X.InterfaceC75846Tpi;
import X.InterfaceC75991Ts3;
import X.InterfaceC88472Yns;
import X.OHQ;
import X.U26;
import X.ViewOnClickListenerC75840Tpc;
import X.X1D;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostManagerContract$AbsView;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.android.livesdk.model.message.CohostTopicMessage;
import com.bytedance.android.livesdk.model.message.TopicSetContent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiCoHostManagerFragment extends MultiCoHostManagerContract$AbsView implements InterfaceC75846Tpi, InterfaceC75991Ts3, InterfaceC75451TjL {
    public static final /* synthetic */ int LJZ = 0;
    public DataChannel LJLJJLL;
    public View LJLJL;
    public boolean LJLL;
    public boolean LJLLI;
    public InterfaceC88472Yns<? super Long, C76800UCe> LJLLILLLL;
    public final Map<Integer, View> LJLZ = new LinkedHashMap();
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 139));
    public final C31413CUn LJLJLLL = new C31413CUn();
    public final CohostTopic LJLLJ = (CohostTopic) ((LinkedHashMap) C75633TmH.LIZ).get(U26.LIZ());
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 138));
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, UserLevelGeckoUpdateSetting.DEFAULT));
    public final C62822Ol8 LJLLLLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 141));

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostManagerContract$AbsView
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLZ).clear();
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostManagerContract$AbsView, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostManagerContract$AbsView, X.InterfaceC75451TjL
    public final void u2(CohostTopicMessage message) {
        o.LJIIIZ(message, "message");
    }

    public final ViewGroup Gl() {
        Object value = this.LJLLLL.getValue();
        o.LJIIIIZZ(value, "<get-topicSelectView>(...)");
        return (ViewGroup) value;
    }

    public final C47121t6 Hl() {
        Object value = this.LJLLLLLL.getValue();
        o.LJIIIIZZ(value, "<get-topicTextView>(...)");
        return (C47121t6) value;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76029Tsf vl() {
        /*
            r6 = this;
            X.Tsf r4 = new X.Tsf
            r4.<init>()
            r0 = 2131836061(0x7f113c9d, float:1.9305278E38)
            java.lang.String r1 = r6.getString(r0)
            java.lang.String r0 = "getString(R.string.pm_co…t_invitehost_panel_title)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r4.LIZ = r1
            android.view.View r0 = r6.LJLJL
            r5 = 0
            if (r0 == 0) goto L76
            int r1 = r0.getHeight()
            boolean r0 = r6.LJLLI
            if (r0 == 0) goto L57
            r0 = 238(0xee, float:3.34E-43)
            float r1 = (float) r0
            float r0 = r6.Dl()
        L27:
            float r1 = r1 + r0
        L28:
            int r0 = (int) r1
            r4.LIZIZ = r0
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r3 = X.C16880lQ.LLZIL(r0)
            android.view.View r2 = r6.getView()
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L55
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L3d:
            r1 = 0
            r0 = 2131563954(0x7f0d15b2, float:1.875338E38)
            android.view.View r2 = X.C16880lQ.LLLLIILL(r3, r0, r2, r1)
            if (r2 == 0) goto L52
            Y.ACListenerS47S0200000_13 r1 = new Y.ACListenerS47S0200000_13
            r0 = 48
            r1.<init>(r6, r2, r0)
            X.C16880lQ.LJIIJ(r1, r2)
            r5 = r2
        L52:
            r4.LJ = r5
            return r4
        L55:
            r2 = r5
            goto L3d
        L57:
            if (r1 == 0) goto L6f
            X.1qj r0 = r6.mo49getActivity()
            if (r0 == 0) goto L6f
            X.1qj r2 = r6.mo49getActivity()
            float r1 = (float) r1
            float r0 = r6.Dl()
            float r0 = r0 + r1
            int r0 = X.B9K.LIZLLL(r2, r0)
            float r1 = (float) r0
            goto L28
        L6f:
            float r0 = r6.Dl()
            r1 = 1127481344(0x43340000, float:180.0)
            goto L27
        L76:
            java.lang.String r0 = "mRootView"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostManagerFragment.vl():X.Tsf");
    }

    public final float Dl() {
        if (Gl().getVisibility() == 8) {
            return 0.0f;
        }
        TextPaint paint = Hl().getPaint();
        if (Build.VERSION.SDK_INT >= 23) {
            StaticLayout build = StaticLayout.Builder.obtain(Hl().getText(), 0, Hl().getText().length(), paint, C81185Vtd.LIZLLL() - C15380j0.LIZ((Hl().getCompoundPaddingStart() + 108.0f) + Hl().getCompoundPaddingEnd())).setMaxLines(2).setEllipsize(TextUtils.TruncateAt.END).build();
            o.LJIIIIZZ(build, "obtain(\n                …\n                .build()");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("topicbannerheight=");
            float f = 32;
            LIZ.append(C15380j0.LJIJ(build.getHeight()) + f);
            LIZ.append("dp");
            C0NB.LIZIZ("MultiCoHostManagerFragment", X1D.LIZIZ(LIZ));
            return C15380j0.LJIJ(build.getHeight()) + f;
        }
        return C15380j0.LJIJ(new StaticLayout(Hl().getText(), paint, C81185Vtd.LIZLLL() - C15380j0.LIZ((Hl().getCompoundPaddingStart() + 108.0f) + Hl().getCompoundPaddingEnd()), Layout.Alignment.ALIGN_NORMAL, Hl().getLineSpacingMultiplier(), Hl().getLineSpacingExtra(), true).getHeight()) + 32;
    }

    @Override // X.InterfaceC75846Tpi
    public final void Yd() {
        String str;
        if (mo49getActivity() == null) {
            return;
        }
        AbstractC75839Tpb abstractC75839Tpb = (AbstractC75839Tpb) this.LJLILLLLZI;
        if (abstractC75839Tpb != null && !abstractC75839Tpb.LIZLLL()) {
            return;
        }
        EnumC76178Tv4 LJ = C76265TwT.LIZ.LJ();
        EnumC76178Tv4 enumC76178Tv4 = EnumC76178Tv4.NORMAL;
        if (LJ != enumC76178Tv4 || C76265TwT.LIZIZ.LJ() != enumC76178Tv4) {
            C30868C9o.LIZJ(R.string.myp);
            return;
        }
        boolean z = this.LJLL;
        HashMap hashMap = new HashMap();
        if (B5G.LIZIZ().LJFF != 0) {
            hashMap.put("channel_id", String.valueOf(B5G.LIZIZ().LJFF));
        }
        C75642TmQ.LJIIJ(hashMap);
        C75642TmQ.LJIIL(null, hashMap);
        C75642TmQ.LJIILJJIL(hashMap);
        C75642TmQ.LJIIIZ(hashMap);
        C75642TmQ.LIZIZ(hashMap);
        C75642TmQ.LJI(hashMap, new C75648TmW(B5G.LIZIZ().LJJLJ));
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_multi_bubble_guide", str);
        C75642TmQ.LIZJ(hashMap);
        C75642TmQ.LIZ(hashMap);
        C75642TmQ.LJJLIIJ("livesdk_connection_management_invite", hashMap);
        InterfaceC75477Tjl interfaceC75477Tjl = this.LJLIL;
        if (interfaceC75477Tjl != null) {
            EnumC76391TyV enumC76391TyV = EnumC76391TyV.INVITE_MULTI_CO_HOST_USER_LIST_FRAGMENT;
            InterfaceC88472Yns<? super Long, C76800UCe> interfaceC88472Yns = this.LJLLILLLL;
            C75475Tjj c75475Tjj = new C75475Tjj();
            c75475Tjj.LIZIZ = true;
            c75475Tjj.LIZJ = interfaceC88472Yns;
            interfaceC75477Tjl.W5(enumC76391TyV, c75475Tjj);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        T t = this.LJLILLLLZI;
        if (t != 0) {
            t.LIZIZ();
        }
        this.LJLILLLLZI = null;
    }

    @Override // X.InterfaceC75991Ts3
    public final void C3(C75883TqJ user) {
        AbstractC75839Tpb abstractC75839Tpb;
        o.LJIIIZ(user, "user");
        if (this.mStatusViewValid && (abstractC75839Tpb = (AbstractC75839Tpb) this.LJLILLLLZI) != null) {
            abstractC75839Tpb.LIZJ(user);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostManagerContract$AbsView, X.InterfaceC75451TjL
    public final void r8(CohostTopicMessage message) {
        Integer valueOf;
        Integer LJI;
        Integer LJI2;
        o.LJIIIZ(message, "message");
        if (!this.mStatusViewValid) {
            return;
        }
        TopicSetContent topicSetContent = message.topicSetContent;
        String str = null;
        if (topicSetContent == null || (valueOf = Integer.valueOf(topicSetContent.action)) == null) {
            return;
        }
        if (valueOf.intValue() == 0) {
            TopicSetContent topicSetContent2 = message.topicSetContent;
            if (topicSetContent2 != null && Long.valueOf(topicSetContent2.setUserId).equals(Long.valueOf(C44432HcC.LJI()))) {
                this.LJLIL.dismiss();
            }
            C47121t6 Hl = Hl();
            C86881Y7x LIZIZ = C86881Y7x.LIZIZ();
            CohostTopic cohostTopic = message.topic;
            if (cohostTopic != null) {
                str = cohostTopic.titleKey;
            }
            Hl.setText(LIZIZ.LIZ(str));
            Context context = getContext();
            if (context == null || (LJI2 = C79045V0n.LJI(R.attr.ax8, context)) == null) {
                return;
            }
            Hl().setTextColor(LJI2.intValue());
            return;
        }
        if (valueOf.intValue() != 1) {
            return;
        }
        this.LJLIL.dismiss();
        Hl().setText(C15380j0.LJIILJJIL(R.string.onl));
        Context context2 = getContext();
        if (context2 == null || (LJI = C79045V0n.LJI(R.attr.axa, context2)) == null) {
            return;
        }
        Hl().setTextColor(LJI.intValue());
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostManagerContract$AbsView
    public final void wl(CJ2 items) {
        o.LJIIIZ(items, "items");
        Iterator<Object> it = items.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateUserList, data = ");
            LIZ.append(next);
            C0NB.LJIIIZ("MultiCoHostManagerFragment", X1D.LIZIZ(LIZ));
        }
        if (!this.mStatusViewValid) {
            return;
        }
        C31413CUn c31413CUn = this.LJLJLLL;
        c31413CUn.LJLIL = items;
        c31413CUn.notifyDataSetChanged();
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostManagerContract$AbsView
    public final void xl(int i) {
        if (!this.mStatusViewValid) {
            return;
        }
        this.LJLJLLL.notifyItemChanged(i);
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostManagerContract$AbsView
    public final void Al(EnumC75763ToN enumC75763ToN, String str) {
        o.LJIIIZ(enumC75763ToN, OHQ.LIZ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateTopicInfoBanner, permission=");
        LIZ.append(enumC75763ToN);
        C0NB.LIZIZ("MultiCoHostManagerFragment", X1D.LIZIZ(LIZ));
        int i = C75764ToO.LIZ[enumC75763ToN.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                Gl().setVisibility(0);
                C29306Beo.LJJJLL(Gl(), 500L, new AqS179S0100000_13(this, 198));
                return;
            }
            Gl().setVisibility(0);
            if (!C29306Beo.LJIJJLI(str)) {
                return;
            }
            C16880lQ.LJIIL(Gl(), new ViewOnClickListenerC75840Tpc(str));
            return;
        }
        Gl().setVisibility(8);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        Object obj;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        boolean z2 = this.LJLL;
        CohostTopic cohostTopic = this.LJLLJ;
        boolean z3 = false;
        if (cohostTopic != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && (cohostTopic == null || cohostTopic.id != 0)) {
            z3 = true;
        }
        HashMap hashMap = new HashMap();
        if (B5G.LIZIZ().LJFF != 0) {
            hashMap.put("channel_id", String.valueOf(B5G.LIZIZ().LJFF));
        }
        C75642TmQ.LJIIJ(hashMap);
        C75642TmQ.LJIIL(null, hashMap);
        C75642TmQ.LJIILJJIL(hashMap);
        C75642TmQ.LJIIIZ(hashMap);
        C75642TmQ.LIZIZ(hashMap);
        C75642TmQ.LJI(hashMap, new C75648TmW(B5G.LIZIZ().LJJLJ));
        String str = "1";
        if (z2) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_multi_bubble_guide", obj);
        if (!z3) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("topic_show_status", str);
        C75642TmQ.LIZJ(hashMap);
        C75642TmQ.LIZ(hashMap);
        C75642TmQ.LJJLIIJ("livesdk_connection_management_panel_show", hashMap);
        AbstractC75839Tpb abstractC75839Tpb = (AbstractC75839Tpb) this.LJLILLLLZI;
        if (abstractC75839Tpb != null) {
            abstractC75839Tpb.LJIIIZ();
        }
        AbstractC75839Tpb abstractC75839Tpb2 = (AbstractC75839Tpb) this.LJLILLLLZI;
        if (abstractC75839Tpb2 != null) {
            abstractC75839Tpb2.LJIIIIZZ();
        }
        AbstractC75839Tpb abstractC75839Tpb3 = (AbstractC75839Tpb) this.LJLILLLLZI;
        if (abstractC75839Tpb3 != null) {
            abstractC75839Tpb3.LJI();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostManagerFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
