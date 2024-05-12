package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.comment.bubble.cell.TaggedPeopleAvatarCell;
import com.ss.android.ugc.aweme.comment.bubble.cell.TaggedPeopleEditCell;
import com.ss.android.ugc.aweme.comment.bubble.cell.TaggedPeopleExpandCell;
import com.ss.android.ugc.aweme.comment.bubble.cell.TaggedPeopleFoldCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfoEvent;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfoKt;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.7BF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7BF extends FrameLayout implements Observer<C207668Da> {
    public final C1811679c LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final List<C7B9> LJLJI;
    public Aweme LJLJJI;
    public DataCenter LJLJJL;
    public C1796773j LJLJJLL;
    public final int LJLJL;
    public final java.util.Set<String> LJLJLJ;

    public final void LIZIZ(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentTaggedPeopleView: updateDataList ");
        LIZ.append(z);
        C71Y.LIZLLL("CommentTaggedPeopleView", X1D.LIZIZ(LIZ));
        C1796773j c1796773j = this.LJLJJLL;
        if (c1796773j != null) {
            c1796773j.setTaggedPeopleFold(z);
        }
        C173966sC c173966sC = null;
        if (z) {
            if (((ArrayList) this.LJLJI).size() > this.LJLJL - 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(((ArrayList) this.LJLJI).subList(0, this.LJLJL - 2));
                arrayList.add(new C7BH(((ArrayList) this.LJLJI).size(), this.LJLJL, this.LJLJJL));
                DataCenter dataCenter = this.LJLJJL;
                C1796773j c1796773j2 = this.LJLJJLL;
                if (c1796773j2 != null) {
                    c173966sC = c1796773j2.getMobParams();
                }
                arrayList.add(new C7BB(dataCenter, c173966sC));
                this.LJLIL.getState().LJIILLIIL(arrayList);
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.LJLJI);
            DataCenter dataCenter2 = this.LJLJJL;
            C1796773j c1796773j3 = this.LJLJJLL;
            if (c1796773j3 != null) {
                c173966sC = c1796773j3.getMobParams();
            }
            arrayList2.add(new C7BB(dataCenter2, c173966sC));
            this.LJLIL.getState().LJIILLIIL(arrayList2);
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(this.LJLJI);
        arrayList3.add(new C7BD(this.LJLJJL));
        DataCenter dataCenter3 = this.LJLJJL;
        C1796773j c1796773j4 = this.LJLJJLL;
        if (c1796773j4 != null) {
            c173966sC = c1796773j4.getMobParams();
        }
        arrayList3.add(new C7BB(dataCenter3, c173966sC));
        this.LJLIL.getState().LJIILLIIL(arrayList3);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        Object obj;
        String str;
        InteractionTagInfo interactionTagInfo;
        AwemeStatus status;
        InteractionTagInfo interactionTagInfo2;
        AwemeStatus status2;
        C207668Da c207668Da2 = c207668Da;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onChanged: ");
        List<InteractionTagUserInfo> list = null;
        if (c207668Da2 != null) {
            obj = c207668Da2.LIZIZ;
            if (obj == null) {
                obj = null;
            }
        } else {
            obj = null;
        }
        LIZ.append(obj);
        C71Y.LIZLLL("CommentTaggedPeopleView", X1D.LIZIZ(LIZ));
        if (c207668Da2 == null || (str = c207668Da2.LIZ) == null || str.hashCode() != -1771772845 || !str.equals("TAGGED_PEOPLE_ACTION")) {
            return;
        }
        Object obj2 = c207668Da2.LIZIZ;
        if (obj2 == null) {
            obj2 = null;
        }
        Integer num = (Integer) obj2;
        if (num == null) {
            return;
        }
        if (num.intValue() == 3) {
            LIZIZ(true);
            return;
        }
        int i = 0;
        if (num == null) {
            return;
        }
        if (num.intValue() == 4) {
            LIZIZ(false);
            return;
        }
        if (num.intValue() != 2) {
            return;
        }
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        o.LJI(LJIJJ);
        if (!(LJIJJ instanceof ActivityC45651qj) || this.LJLJJI == null || LJIJJ == null) {
            return;
        }
        if (C186997Vn.LIZJ()) {
            C186927Vg c186927Vg = C186927Vg.LIZIZ;
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context2);
            o.LJI(LJJIFFI);
            Aweme aweme = this.LJLJJI;
            if (aweme != null && (status2 = aweme.getStatus()) != null) {
                i = status2.getPrivateStatus();
            }
            Aweme aweme2 = this.LJLJJI;
            if (aweme2 != null && (interactionTagInfo2 = aweme2.getInteractionTagInfo()) != null) {
                list = interactionTagInfo2.getTaggedUsers();
            }
            c186927Vg.LIZLLL(LJJIFFI, "", aweme, i, list, new C7BG(this));
            return;
        }
        C186927Vg c186927Vg2 = C186927Vg.LIZIZ;
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        Aweme aweme3 = this.LJLJJI;
        if (aweme3 != null && (status = aweme3.getStatus()) != null) {
            i = status.getPrivateStatus();
        }
        Aweme aweme4 = this.LJLJJI;
        if (aweme4 != null && (interactionTagInfo = aweme4.getInteractionTagInfo()) != null) {
            list = interactionTagInfo.getTaggedUsers();
        }
        c186927Vg2.LJFF(context3, "", aweme3, i, list, C64328PMm.LJLIL);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onInteractionTagInfoEvent(InteractionTagInfoEvent interactionTagInfoEvent) {
        Aweme aweme;
        if (interactionTagInfoEvent == null) {
            return;
        }
        C1796773j c1796773j = this.LJLJJLL;
        if (c1796773j != null && (aweme = c1796773j.getAweme()) != null) {
            aweme.setInteractionTagInfo(interactionTagInfoEvent.aweme.getInteractionTagInfo());
        }
        C1796773j c1796773j2 = this.LJLJJLL;
        if (c1796773j2 != null) {
            LIZ(this.LJLJJL, c1796773j2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7BF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJI = new ArrayList();
        this.LJLJL = 8;
        this.LJLJLJ = new LinkedHashSet();
        FrameLayout.inflate(context, R.layout.r9, this);
        View findViewById = findViewById(R.id.l0n);
        o.LJIIIIZZ(findViewById, "this.findViewById(R.id.taggedTv)");
        TuxTextView tuxTextView = (TuxTextView) findViewById;
        this.LJLILLLLZI = tuxTextView;
        View findViewById2 = findViewById(R.id.l0o);
        o.LJIIIIZZ(findViewById2, "this.findViewById(R.id.tagged_list)");
        C1811679c c1811679c = (C1811679c) findViewById2;
        this.LJLIL = c1811679c;
        c1811679c.setItemAnimator(null);
        c1811679c.LLLF.LJZL(TaggedPeopleAvatarCell.class, TaggedPeopleExpandCell.class, TaggedPeopleFoldCell.class, TaggedPeopleEditCell.class);
        c1811679c.setItemAnimator(null);
        float LIZ = (C47135Ieh.LIZ(52, C47135Ieh.LIZ(21, C60996Nwm.LJIIJ(context))) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))) - tuxTextView.getPaint().measureText("Tagged:");
        final int LJJIIZ = (int) ((O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)) + LIZ) / (O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)) + C7MY.LIZIZ(24)));
        this.LJLJL = LJJIIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("bindTaggedPeople  maxW:");
        LIZ2.append(LIZ);
        LIZ2.append("  count:");
        LIZ2.append(LJJIIZ);
        C71Y.LIZLLL("CommentTaggedPeopleView", X1D.LIZIZ(LIZ2));
        final int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
        c1811679c.LJII(new AbstractC030309z(LJJIIZ, LJJIIZ2) { // from class: X.6du
            public final int LJLIL;
            public final int LJLILLLLZI;

            {
                this.LJLIL = LJJIIZ;
                this.LJLILLLLZI = LJJIIZ2;
            }

            @Override // X.AbstractC030309z
            public final void LJ(Rect outRect, View view, RecyclerView parent, C0AC state) {
                o.LJIIIZ(outRect, "outRect");
                o.LJIIIZ(view, "view");
                o.LJIIIZ(parent, "parent");
                o.LJIIIZ(state, "state");
                if (RecyclerView.LJJJJJ(view) >= this.LJLIL) {
                    outRect.top = this.LJLILLLLZI;
                }
            }
        }, -1);
    }

    public final void LIZ(DataCenter dataCenter, C1796773j c1796773j) {
        List<InteractionTagUserInfo> taggedUsers;
        List<InteractionTagUserInfo> taggedUsers2;
        InteractionTagInfo interactionTagInfo = c1796773j.getAweme().getInteractionTagInfo();
        if (interactionTagInfo == null || (taggedUsers = interactionTagInfo.getTaggedUsers()) == null || taggedUsers.isEmpty() || (!C7F0.LIZJ() && !C186997Vn.LIZIZ())) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.LJLIL.setMaxLineCount(this.LJLJL);
        this.LJLJJLL = c1796773j;
        this.LJLJJI = c1796773j.getAweme();
        ((ArrayList) this.LJLJI).clear();
        this.LJLJLJ.clear();
        InteractionTagInfo interactionTagInfo2 = c1796773j.getAweme().getInteractionTagInfo();
        if (interactionTagInfo2 != null && (taggedUsers2 = interactionTagInfo2.getTaggedUsers()) != null) {
            List LLJILJILJ = ORZ.LLJILJILJ(taggedUsers2);
            ArrayList arrayList = new ArrayList(C32I.LJJL(LLJILJILJ, 10));
            Iterator it = ((ArrayList) LLJILJILJ).iterator();
            while (it.hasNext()) {
                arrayList.add(new C7B7(InteractionTagInfoKt.toUser((InteractionTagUserInfo) it.next()), c1796773j.getMobParams(), this.LJLJLJ));
            }
            ((ArrayList) this.LJLJI).addAll(ORZ.LLJILJILJ(arrayList));
        }
        String quantityString = getResources().getQuantityString(R.plurals.fe, ((ArrayList) this.LJLJI).size());
        o.LJIIIIZZ(quantityString, "resources\n            .g…alData.size\n            )");
        TuxTextView tuxTextView = this.LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(quantityString);
        LIZ.append(':');
        tuxTextView.setText(X1D.LIZIZ(LIZ));
        this.LJLJJL = dataCenter;
        LIZIZ(c1796773j.isTaggedPeopleFold());
    }
}
