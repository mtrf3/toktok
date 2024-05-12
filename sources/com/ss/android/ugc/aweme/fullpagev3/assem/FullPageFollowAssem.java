package com.ss.android.ugc.aweme.fullpagev3.assem;

import X.C16880lQ;
import X.C184387Lm;
import X.C1JX;
import X.C221108m2;
import X.C32151Nz;
import X.C62822Ol8;
import X.C78886Uxe;
import X.J7H;
import X.KL2;
import X.O6R;
import X.OUP;
import X.W5F;
import Y.ACListenerS23S0100000_3;
import Y.AObserverS71S0100000_3;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.viewmodel.PostModeContainerViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FullPageFollowAssem extends BaseFullPageAssem {
    public int LJLJJI;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 426));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void C3(String str) {
        Aweme aweme;
        User author;
        Context context = getContext();
        if (context != null && (aweme = A3().getAweme()) != null && (author = aweme.getAuthor()) != null) {
            C78886Uxe.LJJLIIIJLLLLLLLZ(author, context, "graphic_detail", str, null, null, 4076);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        User user;
        MutableLiveData<Integer> mutableLiveData;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Aweme aweme = A3().getAweme();
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        if (user != null) {
            W5F LJI = C1JX.LJI(user);
            LJI.LJIILIIL(J7H.LIZ(100));
            int LIZJ = (int) KL2.LIZJ(getContext(), 28.0f);
            int LIZJ2 = (int) KL2.LIZJ(getContext(), 28.0f);
            LJI.LJII = LIZJ;
            LJI.LJIIIIZZ = LIZJ2;
            LJI.LJJIJIIJIL = true;
            LJI.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.acf);
            LJI.LJ();
            View _$_findCachedViewById = _$_findCachedViewById(R.id.dki);
            if (_$_findCachedViewById != null) {
                OUP.LJJJJJL(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), _$_findCachedViewById);
            }
            TextView textView = (TextView) _$_findCachedViewById(R.id.h1j);
            if (textView != null) {
                textView.setText(user.getNickname());
            }
            RelationButton relationButton = (RelationButton) _$_findCachedViewById(R.id.iuh);
            if (relationButton != null) {
                C184387Lm.LIZIZ(relationButton, user, A3());
            }
        }
        PostModeContainerViewModel v3 = v3();
        if (v3 != null && (mutableLiveData = v3.LLIIL) != null) {
            getActualLifecycleOwner();
            mutableLiveData.observe(this, new AObserverS71S0100000_3(this, 66));
        }
        SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) _$_findCachedViewById(R.id.acf);
        if (smartAvatarImageView != null) {
            C16880lQ.LJJJJL(smartAvatarImageView, new ACListenerS23S0100000_3(this, 255));
        }
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.h1j);
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS23S0100000_3(this, 256));
        }
    }
}
