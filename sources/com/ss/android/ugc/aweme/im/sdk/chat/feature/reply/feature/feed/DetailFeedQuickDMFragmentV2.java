package com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed;

import X.AnonymousClass391;
import X.C018905p;
import X.C110614Vt;
import X.C110944Xa;
import X.C111024Xi;
import X.C16880lQ;
import X.C47261Igj;
import X.C4BT;
import X.C4J5;
import X.C4XW;
import X.C4YG;
import X.C61328O5c;
import X.C63081OpJ;
import X.InterfaceC1031843e;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS21S0100000_1;
import Y.ALAdapterS0S0100000_1;
import Y.IDObjectS174S0100000_1;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedQuickDMFragmentV2;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DetailFeedQuickDMFragmentV2 extends BaseInputFragment {
    public C4J5 LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public Aweme LJLLLLLL;
    public String LJLZ;
    public boolean LJZ;
    public final Map<Integer, View> LJZI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZI).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputFragment, com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputFragment
    public final int wl() {
        return R.layout.b22;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputFragment
    public final BaseInputView Gl() {
        C4BT c4bt;
        C111024Xi reply_input_container = (C111024Xi) _$_findCachedViewById(R.id.iwa);
        o.LJIIIIZZ(reply_input_container, "reply_input_container");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
        StoryQuickDMInputView storyQuickDMInputView = new StoryQuickDMInputView(reply_input_container, viewLifecycleOwner);
        storyQuickDMInputView.LJLZ = this;
        View view = getView();
        if (view != null && (c4bt = storyQuickDMInputView.LJLJL) != null) {
            c4bt.setOuterView(view);
        }
        storyQuickDMInputView.LJZ = new AqS151S0100000_1(this, 147);
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 45), _$_findCachedViewById(R.id.iwb));
        String str = this.LJLZ;
        if (str != null) {
            C4YG xl = xl();
            char[] charArray = str.toCharArray();
            o.LJIIIIZZ(charArray, "this as java.lang.String).toCharArray()");
            xl.setText(charArray, 0, str.length());
            xl().setSelection(str.length());
        }
        View view2 = this.LJLJL;
        if (view2 != null) {
            C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 46), view2);
            _$_findCachedViewById(R.id.ikt).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS21S0100000_1(this, 47)));
            C4XW c4xw = new C4XW() { // from class: X.4XP
                @Override // X.C4XW
                public final void LIZ() {
                    View view3;
                    Window window;
                    Window window2;
                    DetailFeedQuickDMFragmentV2 detailFeedQuickDMFragmentV2 = DetailFeedQuickDMFragmentV2.this;
                    detailFeedQuickDMFragmentV2.LJLLLL = true;
                    ActivityC45651qj mo49getActivity = detailFeedQuickDMFragmentV2.mo49getActivity();
                    View view4 = DetailFeedQuickDMFragmentV2.this.getView();
                    if (view4 != null) {
                        view3 = view4.findViewById(R.id.cow);
                    } else {
                        view3 = null;
                    }
                    AnonymousClass435.LIZ(mo49getActivity, view3);
                    DetailFeedQuickDMFragmentV2.this._$_findCachedViewById(R.id.iwa).setVisibility(8);
                    Dialog dialog = DetailFeedQuickDMFragmentV2.this.getDialog();
                    if (dialog != null && (window2 = dialog.getWindow()) != null) {
                        C28289B8j.LIZIZ(0, window2);
                    }
                    Dialog dialog2 = DetailFeedQuickDMFragmentV2.this.getDialog();
                    if (dialog2 != null && (window = dialog2.getWindow()) != null) {
                        window.setDimAmount(0.0f);
                    }
                }

                @Override // X.C4XW
                public final void LIZIZ(int i, String emojiText) {
                    String str2;
                    o.LJIIIZ(emojiText, "emojiText");
                    Aweme aweme = DetailFeedQuickDMFragmentV2.this.LJLLLLLL;
                    if (aweme != null) {
                        str2 = aweme.getAuthorUid();
                    } else {
                        str2 = null;
                    }
                    C2U8.LIZ(new C4XR(str2));
                    DetailFeedQuickDMFragmentV2 detailFeedQuickDMFragmentV2 = DetailFeedQuickDMFragmentV2.this;
                    detailFeedQuickDMFragmentV2.LJLLLL = false;
                    detailFeedQuickDMFragmentV2.dismiss();
                    DetailFeedQuickDMFragmentV2.this.getClass();
                    C4J5 c4j5 = DetailFeedQuickDMFragmentV2.this.LJLLILLLL;
                    if (c4j5 != null) {
                        c4j5.n2(emojiText, true);
                    }
                }
            };
            C110944Xa quick_emoji_layout = (C110944Xa) _$_findCachedViewById(R.id.ikt);
            o.LJIIIIZZ(quick_emoji_layout, "quick_emoji_layout");
            quick_emoji_layout.setNeedPlayAnimation(!this.LJZ);
            quick_emoji_layout.setEmojiViewSize(40.0f);
            quick_emoji_layout.setIncludePadding(false);
            quick_emoji_layout.setEmojiDataList(C47261Igj.LJJIJIIJI("😍", "😂", "😳", "🤩", "❤️", "👏🏼", "🔥", "🎉"));
            quick_emoji_layout.setOnEmojiSelected(c4xw);
            InterfaceC1031843e interfaceC1031843e = new InterfaceC1031843e() { // from class: X.4XU
                @Override // X.InterfaceC1031843e
                public final void cQ(CharSequence s) {
                    boolean z;
                    o.LJIIIIZZ(s, "s");
                    if (s.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    DetailFeedQuickDMFragmentV2 detailFeedQuickDMFragmentV2 = DetailFeedQuickDMFragmentV2.this;
                    if (z & (!detailFeedQuickDMFragmentV2.LJLLJ)) {
                        detailFeedQuickDMFragmentV2.LJLLL = false;
                        detailFeedQuickDMFragmentV2._$_findCachedViewById(R.id.ikt).animate().setListener(new ALAdapterS0S0100000_1(DetailFeedQuickDMFragmentV2.this, 3)).alpha(1.0f).setDuration(130L);
                    } else {
                        if (detailFeedQuickDMFragmentV2.LJLLL) {
                            return;
                        }
                        detailFeedQuickDMFragmentV2.LJLLL = true;
                        detailFeedQuickDMFragmentV2._$_findCachedViewById(R.id.ikt).animate().setListener(new ALAdapterS0S0100000_1(DetailFeedQuickDMFragmentV2.this, 4)).alpha(0.0f).setDuration(130L);
                    }
                }
            };
            C4YG c4yg = storyQuickDMInputView.LJLILLLLZI;
            if (c4yg != null) {
                c4yg.addTextChangedListener(new IDObjectS174S0100000_1(interfaceC1031843e, 7));
            }
            return storyQuickDMInputView;
        }
        o.LJIJI("sendBtn");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputFragment
    public final void Dl() {
        C111024Xi reply_input_container = (C111024Xi) _$_findCachedViewById(R.id.iwa);
        o.LJIIIIZZ(reply_input_container, "reply_input_container");
        this.LJLJI = reply_input_container;
        C4YG msg_et = (C4YG) _$_findCachedViewById(R.id.gnm);
        o.LJIIIIZZ(msg_et, "msg_et");
        this.LJLJJL = msg_et;
        View send_btn = _$_findCachedViewById(R.id.jo1);
        o.LJIIIIZZ(send_btn, "send_btn");
        this.LJLJL = send_btn;
        ViewGroup panel_container = (ViewGroup) _$_findCachedViewById(R.id.hho);
        o.LJIIIIZZ(panel_container, "panel_container");
        this.LJLJJI = panel_container;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.b9v);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = C61328O5c.LIZJ(24);
        c110614Vt.LJFF = Integer.valueOf(R.attr.dm);
        c110614Vt.LIZLLL = AnonymousClass391.LIZJ(1);
        Context context = Al().getContext();
        o.LJIIIIZZ(context, "rootContainer.context");
        _$_findCachedViewById.setBackground(c110614Vt.LIZ(context));
        Context context2 = getContext();
        if (context2 != null) {
            _$_findCachedViewById(R.id.ikt).setLayoutParams(new C018905p(-1, Integer.valueOf(C63081OpJ.LJJJJJL(context2)).intValue() / 2));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputFragment, com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        boolean z;
        super.onActivityCreated(bundle);
        String str = this.LJLZ;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View view = this.LJLJL;
            if (view != null) {
                view.setVisibility(8);
                return;
            } else {
                o.LJIJI("sendBtn");
                throw null;
            }
        }
        View view2 = this.LJLJL;
        if (view2 != null) {
            view2.setVisibility(0);
        } else {
            o.LJIJI("sendBtn");
            throw null;
        }
    }
}
