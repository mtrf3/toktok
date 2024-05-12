package com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed;

import X.ActivityC45651qj;
import X.C105624Co;
import X.C107274Ix;
import X.C10A;
import X.C116614ht;
import X.C141335gf;
import X.C16880lQ;
import X.C1GE;
import X.C221108m2;
import X.C221648mu;
import X.C222578oP;
import X.C29S;
import X.C2IP;
import X.C2U8;
import X.C34B;
import X.C3C5;
import X.C45804HyK;
import X.C4J3;
import X.C61447O9r;
import X.C62822Ol8;
import X.C6ZT;
import X.C73340SqO;
import X.C76800UCe;
import X.C79045V0n;
import X.C90903hW;
import X.C92923km;
import X.C93683m0;
import X.C95043oC;
import X.InterfaceC110994Xf;
import X.InterfaceC116624hu;
import X.InterfaceC224518rX;
import X.InterfaceC92963kq;
import X.InterfaceC98813uH;
import android.content.Context;
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
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedQuickDMFrgament;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DetailFeedQuickDMFrgament extends BaseFragment implements InterfaceC110994Xf, View.OnClickListener, InterfaceC224518rX {
    public static final /* synthetic */ int LJLJJLL = 0;
    public InterfaceC92963kq LJLIL;
    public Aweme LJLILLLLZI;
    public Bundle LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C93683m0.LJLIL);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC110994Xf
    public final void ob() {
        C2U8.LIZ(new C2IP(true, false));
    }

    public final void xl() {
        String str;
        TextView textView;
        User author;
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            str = author.getNickname();
        } else {
            str = null;
        }
        if (!C1GE.LJIIL(str) || (textView = (TextView) _$_findCachedViewById(R.id.iwe)) == null) {
            return;
        }
        textView.setHint(getResources().getString(R.string.enk, str));
    }

    @Override // X.InterfaceC224518rX
    public final void A0(View view) {
        View findViewById;
        if (view == null || (findViewById = view.findViewById(R.id.efm)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    @Override // X.InterfaceC224518rX
    public final void LLZL(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LJLILLLLZI = aweme;
        xl();
    }

    @Override // X.InterfaceC110994Xf
    public final void Wb(String str) {
        C2U8.LIZ(new C2IP(false, false));
        if (C73340SqO.LJIIJ(this)) {
            ((TextView) _$_findCachedViewById(R.id.iwe)).setText(str);
            vl(str);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        User author;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        ActivityC45651qj LJJIFFI;
        String str6;
        String string;
        CharSequence text;
        if (!C73340SqO.LJIIJ(this) || C6ZT.LIZIZ(view, 500L)) {
            return;
        }
        String str7 = "";
        if (o.LJ(view, _$_findCachedViewById(R.id.jok))) {
            C34B.LJI("DetailQuickDMFragment", "send button is clicked");
            if (!C73340SqO.LJIIJ(this) || (text = ((AppCompatTextView) _$_findCachedViewById(R.id.iwe)).getText()) == null) {
                return;
            }
            wl(text);
            ((TextView) _$_findCachedViewById(R.id.iwe)).setText("");
            vl("");
            return;
        }
        if (!o.LJ(view, _$_findCachedViewById(R.id.iwe))) {
            return;
        }
        C34B.LJI("DetailQuickDMFragment", "reply message box is clicked");
        Aweme aweme = this.LJLILLLLZI;
        if (aweme == null || (author = aweme.getAuthor()) == null) {
            return;
        }
        Context context = getContext();
        String str8 = null;
        if (context != null) {
            str = context.getString(R.string.enk, aweme.getAuthor().getNickname());
        } else {
            str = null;
        }
        Context context2 = getContext();
        if (context2 != null && (LJJIFFI = C45804HyK.LJJIFFI(context2)) != null) {
            InterfaceC98813uH imChatService = ((IIMService) this.LJLJI.getValue()).getImChatService();
            FragmentManager supportFragmentManager = LJJIFFI.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "it.supportFragmentManager");
            Bundle bundle = this.LJLJJI;
            if (bundle != null && (string = bundle.getString("enter_from")) != null) {
                str7 = string;
            }
            Bundle bundle2 = this.LJLJJI;
            if (bundle2 != null) {
                str6 = bundle2.getString("enter_position");
            } else {
                str6 = null;
            }
            imChatService.LJIIIIZZ(supportFragmentManager, author, aweme, str7, str6, null, this.LJLIL, true, str, this);
        }
        Bundle bundle3 = this.LJLJJI;
        if (bundle3 != null) {
            str2 = bundle3.getString("enter_position");
        } else {
            str2 = null;
        }
        Bundle bundle4 = this.LJLJJI;
        if (bundle4 != null) {
            str3 = bundle4.getString("enter_from");
        } else {
            str3 = null;
        }
        Bundle bundle5 = this.LJLJJI;
        if (bundle5 != null) {
            str4 = bundle5.getString("group_id");
        } else {
            str4 = null;
        }
        Bundle bundle6 = this.LJLJJI;
        if (bundle6 != null) {
            str5 = bundle6.getString("author_id");
        } else {
            str5 = null;
        }
        Bundle bundle7 = this.LJLJJI;
        if (bundle7 != null) {
            str8 = bundle7.getString("follow_status");
        }
        C222578oP.LJIIIZ(new C221648mu(str2, str3, str4, str5, str8));
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
        Context context = getContext();
        if (context != null) {
            if (z3) {
                i2 = R.attr.eb;
            } else {
                i2 = R.attr.ld;
            }
            Integer LJI = C79045V0n.LJI(i2, context);
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

    public final void wl(CharSequence charSequence) {
        User user;
        String string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            Aweme aweme = this.LJLILLLLZI;
            String str = null;
            if (aweme != null) {
                user = aweme.getAuthor();
            } else {
                user = null;
            }
            Aweme aweme2 = this.LJLILLLLZI;
            Bundle bundle = this.LJLJJI;
            if (bundle != null) {
                str = bundle.getString("enter_from");
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            Bundle bundle2 = this.LJLJJI;
            if (bundle2 != null && (string = bundle2.getString("enter_position")) != null) {
                str2 = string;
            }
            C107274Ix.LJII(charSequence2, user, aweme2, str, "story_exposed_emoji", str2, Boolean.TRUE, new C4J3() { // from class: X.3m1
                @Override // X.C4J3
                public final void LIZIZ() {
                }
            });
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        xl();
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.iwe), this);
        TuxIconView tuxIconView = (TuxIconView) _$_findCachedViewById(R.id.jok);
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, this);
        }
        if (C95043oC.LIZIZ) {
            C116614ht c116614ht = (C116614ht) _$_findCachedViewById(R.id.cuj);
            if (c116614ht != null) {
                c116614ht.setEmojiRecommendationSelectListener(new InterfaceC116624hu() { // from class: X.3lz
                    @Override // X.InterfaceC116624hu
                    public final void LIZ(int i, CharSequence charSequence) {
                        if (charSequence == null) {
                            return;
                        }
                        DetailFeedQuickDMFrgament.this.wl(charSequence.toString());
                        InterfaceC92963kq interfaceC92963kq = DetailFeedQuickDMFrgament.this.LJLIL;
                        if (interfaceC92963kq != null) {
                            interfaceC92963kq.LIZ(charSequence);
                        }
                    }
                });
            }
        } else {
            _$_findCachedViewById(R.id.cuj).setVisibility(8);
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            float LIZ = C92923km.LIZ(mo49getActivity, C61447O9r.LJIIJJI);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = (int) LIZ;
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b24, viewGroup, false);
        ((ViewStub) LLLLIILL.findViewById(R.id.iwp)).inflate();
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

    @Override // X.InterfaceC224518rX
    public final void pj(View view, Aweme aweme, Bundle bundle) {
        View findViewById;
        this.LJLJJI = bundle;
        if (aweme != null) {
            if (view != null && (findViewById = view.findViewById(R.id.efm)) != null) {
                findViewById.setVisibility(0);
            }
            this.LJLILLLLZI = aweme;
        }
    }
}
