package com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed;

import X.AbstractC92763kW;
import X.ActivityC45651qj;
import X.C105624Co;
import X.C109544Rq;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1GE;
import X.C221108m2;
import X.C29S;
import X.C34B;
import X.C38350F3i;
import X.C3C5;
import X.C62822Ol8;
import X.C6ZT;
import X.C73340SqO;
import X.C76800UCe;
import X.C772831o;
import X.C780334l;
import X.C79045V0n;
import X.C81244Vua;
import X.C84683Ua;
import X.C84843Uq;
import X.C84903Uw;
import X.C84913Ux;
import X.C85323Wm;
import X.C87687YbD;
import X.C90903hW;
import X.C92723kS;
import X.C92853kf;
import X.C92933kn;
import X.C92943ko;
import X.C92983ks;
import X.C92993kt;
import X.C93023kw;
import X.InterfaceC110994Xf;
import X.InterfaceC92953kp;
import X.InterfaceC92963kq;
import X.LNH;
import X.M89;
import X.XKX;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DetailFeedReplyMessageFragment extends Hilt_DetailFeedReplyMessageFragment implements InterfaceC110994Xf, InterfaceC92953kp, View.OnClickListener {
    public static final /* synthetic */ int LJLLI = 0;
    public String LJLJJI;
    public C109544Rq LJLJJLL;
    public String LJLJL;
    public InterfaceC92963kq LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 148));
    public long LJLJLJ = -1;

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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

    @Override // X.InterfaceC110994Xf
    public final void ob() {
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC92953kp
    public final void ne() {
        String str = this.LJLJJI;
        if (str != null) {
            C93023kw.LIZ(str);
        }
    }

    public final ChatViewModel wl() {
        return (ChatViewModel) this.LJLJJL.getValue();
    }

    public final void n9() {
        ((TextView) _$_findCachedViewById(R.id.iwe)).setText("");
        vl("");
    }

    public final boolean xl() {
        String string;
        int hashCode;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("video_from")) == null || ((hashCode = string.hashCode()) == -233309204 ? !string.equals("from_auto_message") : hashCode != 80178893 || !string.equals("from_chat"))) {
            return false;
        }
        return true;
    }

    public final void Dl(boolean z) {
        Serializable LIZIZ;
        String str;
        long j;
        String str2;
        if (!C73340SqO.LJIIJ(this)) {
            return;
        }
        CharSequence hint = ((TextView) _$_findCachedViewById(R.id.iwe)).getHint();
        CharSequence text = ((AppCompatTextView) _$_findCachedViewById(R.id.iwe)).getText();
        Bundle bundle = new Bundle();
        bundle.putCharSequence("hint", hint);
        bundle.putCharSequence("text", text);
        bundle.putBoolean("showEmojiPanel", z);
        Bundle arguments = getArguments();
        if (arguments == null || (LIZIZ = arguments.getSerializable("video")) == null) {
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            LIZIZ = LNH.LIZIZ(requireActivity);
        }
        String str3 = null;
        if (LIZIZ != null && xl()) {
            bundle.putSerializable("video", LIZIZ);
            C109544Rq c109544Rq = this.LJLJJLL;
            if (c109544Rq != null) {
                j = c109544Rq.getSender();
            } else {
                j = this.LJLJLJ;
            }
            bundle.putLong("shareUserId", j);
            C109544Rq c109544Rq2 = this.LJLJJLL;
            if (c109544Rq2 == null || (str2 = c109544Rq2.getSecSender()) == null) {
                str2 = "";
            }
            bundle.putString("shareMessageSecUserId", str2);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString("video_from");
        } else {
            str = null;
        }
        bundle.putString("video_from", str);
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str3 = arguments3.getString("enter_method");
        }
        bundle.putString("enter_method", str3);
        FragmentManager childFragmentManager = getChildFragmentManager();
        o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
        DetailFeedKeyboardDialogFragment LIZ = C92933kn.LIZ(childFragmentManager);
        LIZ.setArguments(bundle);
        LIZ.LJLL = this;
        LIZ.LJLLLL = this;
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        o.LJIIIIZZ(childFragmentManager2, "childFragmentManager");
        LIZ.show(childFragmentManager2, "ReplyKeyboardDialogFragment");
    }

    @Override // X.InterfaceC110994Xf
    public final void Wb(String str) {
        if (C73340SqO.LJIIJ(this)) {
            if (xl()) {
                n9();
            } else {
                ((TextView) _$_findCachedViewById(R.id.iwe)).setText(str);
            }
            vl(str);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CharSequence text;
        if (!C73340SqO.LJIIJ(this) || C6ZT.LIZIZ(view, 500L)) {
            return;
        }
        if (o.LJ(view, _$_findCachedViewById(R.id.jok))) {
            C34B.LJI("DetailFeedReplyMessageFragment", "send button is clicked");
            if (!C73340SqO.LJIIJ(this) || (text = ((AppCompatTextView) _$_findCachedViewById(R.id.iwe)).getText()) == null) {
                return;
            }
            Al(text, false, false);
            n9();
            return;
        }
        if (o.LJ(view, _$_findCachedViewById(R.id.iwe))) {
            C34B.LJI("DetailFeedReplyMessageFragment", "reply message box is clicked");
            Dl(false);
        } else {
            if (!o.LJ(view, _$_findCachedViewById(R.id.cut))) {
                return;
            }
            C34B.LJI("DetailFeedReplyMessageFragment", "emoji icon is clicked");
            Dl(true);
        }
    }

    public final void vl(String str) {
        int i;
        int i2;
        int i3;
        boolean z;
        TuxIconView tuxIconView = (TuxIconView) _$_findCachedViewById(R.id.jok);
        if (tuxIconView == null) {
            return;
        }
        int length = str.length() - 1;
        int i4 = 0;
        int i5 = 0;
        boolean z2 = false;
        while (i5 <= length) {
            if (!z2) {
                i3 = i5;
            } else {
                i3 = length;
            }
            if (o.LJIIJJI(str.charAt(i3), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i5++;
                }
            } else if (!z) {
                break;
            } else {
                length--;
            }
        }
        boolean z3 = !TextUtils.isEmpty(str.subSequence(i5, length + 1).toString());
        boolean isActivated = tuxIconView.isActivated();
        tuxIconView.setActivated(z3);
        tuxIconView.setEnabled(z3);
        C81244Vua c81244Vua = this.LJLIL;
        if (c81244Vua != null) {
            if (z3) {
                i2 = R.attr.eb;
            } else {
                i2 = R.attr.ld;
            }
            Integer LJI = C79045V0n.LJI(i2, c81244Vua);
            if (LJI != null) {
                i4 = LJI.intValue();
            }
        }
        if (z3) {
            i = R.attr.dj;
        } else {
            i = R.attr.cr;
        }
        tuxIconView.getBackground().setTint(i4);
        tuxIconView.setTintColorRes(i);
        if (z3 && !isActivated) {
            C105624Co.LIZ(tuxIconView);
        }
    }

    @Override // X.InterfaceC92953kp
    public final void n2(CharSequence charSequence, boolean z) {
        String str;
        Al(charSequence, z, true);
        n9();
        C87687YbD.LIZ.getClass();
        if (C87687YbD.LIZ() && (str = this.LJLJJI) != null) {
            C93023kw.LJ.put(str, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x015d, code lost:
    
        if (r2 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0176, code lost:
    
        if (r2 != null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0131  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Al(CharSequence charSequence, boolean z, boolean z2) {
        String str;
        String str2;
        Long LJJIZ;
        C92723kS c92723kS;
        C109544Rq c109544Rq;
        String aid;
        Set<String> set;
        Serializable serializable;
        M89 m89;
        String aid2;
        Aweme i6;
        String str3;
        String str4;
        String string;
        String str5;
        if (charSequence == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("video_from", null)) != null) {
            if (o.LJ(string, "from_auto_message")) {
                str5 = "link_auto_message";
            } else {
                str5 = "chat_video_detail";
            }
            linkedHashMap.put("enter_from", str5);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString("enter_method", null);
        } else {
            str = null;
        }
        if (o.LJ(str, "click_feed_dm_reply_msg")) {
            String str6 = this.LJLJJI;
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                serializable = arguments3.getSerializable("feed_param");
            } else {
                serializable = null;
            }
            if ((serializable instanceof M89) && (m89 = (M89) serializable) != null && (aid2 = m89.getAid()) != null && (i6 = AwemeService.LIZ().i6(aid2)) != null) {
                Bundle arguments4 = getArguments();
                if (arguments4 != null) {
                    str3 = arguments4.getString("to_uid");
                } else {
                    str3 = null;
                }
                Bundle arguments5 = getArguments();
                if (arguments5 != null) {
                    str4 = arguments5.getString("to_sec_uid");
                } else {
                    str4 = null;
                }
                if (C1GE.LJIIL(str3)) {
                    wl().kv0(charSequence, i6, str3, str4, str6);
                } else {
                    wl().kv0(charSequence, i6, i6.getAuthorUid(), i6.getSecAuthorUid(), str6);
                }
            }
        } else if (this.LJLJL == null) {
            ChatViewModel.jv0(wl(), charSequence, this.LJLJJI, null, null, null, linkedHashMap, 28);
        } else {
            ChatViewModel wl = wl();
            String str7 = this.LJLJJI;
            String str8 = this.LJLJL;
            AbstractC92763kW<C109544Rq> value = wl.LJLJLLL.getValue();
            if ((value instanceof C92723kS) && (c92723kS = (C92723kS) value) != null && (c109544Rq = (C109544Rq) c92723kS.LIZ) != null) {
                str2 = Long.valueOf(c109544Rq.getIndex()).toString();
            } else {
                str2 = null;
            }
            if (!o.LJ(str8, str2)) {
                if (str8 != null && (LJJIZ = C38350F3i.LJJIZ(str8)) != null) {
                    long longValue = LJJIZ.longValue();
                    if (str7 != null) {
                        wl.gv0(longValue, str7, new C92853kf(wl, charSequence, str7, linkedHashMap));
                    }
                }
            } else {
                ChatViewModel.jv0(wl, charSequence, str7, null, null, null, linkedHashMap, 28);
            }
        }
        if (!xl()) {
            return;
        }
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        Aweme LIZIZ = LNH.LIZIZ(requireActivity);
        if (LIZIZ != null && (aid = LIZIZ.getAid()) != null) {
            C92983ks c92983ks = (C92983ks) ((LinkedHashMap) C92993kt.LIZ).get(Long.valueOf(C92993kt.LIZIZ));
            if (c92983ks != null && (set = c92983ks.LIZIZ) != null) {
                set.add(aid);
            }
        }
        if (!z) {
            return;
        }
        InterfaceC92963kq interfaceC92963kq = this.LJLJLLL;
        if (interfaceC92963kq != null) {
            interfaceC92963kq.LIZ(charSequence);
        }
        if (!z2) {
            C109544Rq c109544Rq2 = this.LJLJJLL;
            String charSequence2 = charSequence.toString();
            C85323Wm onEventV3 = C772831o.LIZ();
            C780334l c780334l = C780334l.LJLIL;
            C84843Uq c84843Uq = new C84843Uq();
            o.LJIIIZ(onEventV3, "onEventV3");
            if (c109544Rq2 == null) {
                return;
            }
            XKX.LIZLLL(c780334l, null, null, new C84903Uw(c109544Rq2, c84843Uq, charSequence2, onEventV3, null), 3);
            return;
        }
        C109544Rq c109544Rq3 = this.LJLJJLL;
        String charSequence3 = charSequence.toString();
        C85323Wm onEventV32 = C772831o.LIZ();
        C780334l c780334l2 = C780334l.LJLIL;
        C84843Uq c84843Uq2 = new C84843Uq();
        o.LJIIIZ(onEventV32, "onEventV3");
        if (c109544Rq3 == null) {
            return;
        }
        XKX.LIZLLL(c780334l2, null, null, new C84913Ux(c109544Rq3, c84843Uq2, charSequence3, onEventV32, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        C84683Ua.LJFF.LIZIZ(C92943ko.LJ, true);
        if (xl()) {
            i = R.id.iwp;
        } else {
            i = R.id.iwn;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b24, viewGroup, false);
        ((ViewStub) LLLLIILL.findViewById(i)).inflate();
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }
}
