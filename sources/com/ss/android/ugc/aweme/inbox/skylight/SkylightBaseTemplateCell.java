package com.ss.android.ugc.aweme.inbox.skylight;

import X.C116064h0;
import X.C116074h1;
import X.C48709J9t;
import X.C77357UXp;
import X.C7MY;
import X.EnumC116054gz;
import X.InterfaceC57784Mm4;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.CustomBizData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.TemplateData;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public abstract class SkylightBaseTemplateCell<ITEM extends C116074h1> extends PowerCell<ITEM> {
    public static final int LJLJJLL;
    public static final int LJLJL;
    public final int LJLIL = -1;
    public final int LJLILLLLZI = -1;
    public SkylightData LJLJI;
    public TemplateData LJLJJI;
    public CustomBizData LJLJJL;

    public abstract void L(ITEM item);

    public void onAttach() {
    }

    static {
        int i;
        int i2;
        boolean z = C48709J9t.LIZ;
        if (z) {
            i = 88;
        } else {
            i = 80;
        }
        LJLJJLL = C7MY.LIZIZ(i);
        if (z) {
            i2 = 122;
        } else {
            i2 = 114;
        }
        LJLJL = C7MY.LIZIZ(i2);
    }

    public final SkylightData N() {
        SkylightData skylightData = this.LJLJI;
        if (skylightData != null) {
            return skylightData;
        }
        o.LJIJI("skylightData");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        if (C48709J9t.LIZ) {
            return M();
        }
        return P();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        Q(this, EnumC116054gz.SHOW);
        onAttach();
    }

    public int M() {
        return this.LJLIL;
    }

    public int P() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC57784Mm4 interfaceC57784Mm4) {
        C116074h1 t = (C116074h1) interfaceC57784Mm4;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        SkylightData skylightData = t.LJLIL;
        o.LJIIIZ(skylightData, "<set-?>");
        this.LJLJI = skylightData;
        SkylightData N = N();
        this.LJLJJI = N.getTemplateData();
        this.LJLJJL = N.getCustomBizData();
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = LJLJJLL;
            layoutParams.height = LJLJL;
            itemView.setLayoutParams(layoutParams);
            L(t);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static void Q(SkylightBaseTemplateCell skylightBaseTemplateCell, EnumC116054gz event) {
        String str;
        int i;
        User user;
        User user2;
        User user3;
        User user4;
        skylightBaseTemplateCell.getClass();
        o.LJIIIZ(event, "event");
        int bizType = skylightBaseTemplateCell.N().getBizType();
        String str2 = null;
        if (bizType != 1) {
            if (bizType != 2) {
                return;
            } else {
                str = "now";
            }
        } else {
            str = "friends";
        }
        int i2 = C116064h0.LIZ[event.ordinal()];
        int i3 = -1;
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            CustomBizData customBizData = skylightBaseTemplateCell.LJLJJL;
            if (customBizData != null && (user4 = customBizData.getUser()) != null) {
                str2 = user4.getUid();
            }
            CustomBizData customBizData2 = skylightBaseTemplateCell.LJLJJL;
            if (customBizData2 != null && (user3 = customBizData2.getUser()) != null) {
                i3 = user3.getFollowStatus();
            }
            C77357UXp.LJJIJIIJI(skylightBaseTemplateCell, str, str2, Integer.valueOf(i3), null, null, 50);
            return;
        }
        CustomBizData customBizData3 = skylightBaseTemplateCell.LJLJJL;
        if (customBizData3 != null && (user2 = customBizData3.getUser()) != null) {
            str2 = user2.getUid();
        }
        CustomBizData customBizData4 = skylightBaseTemplateCell.LJLJJL;
        if (customBizData4 != null && (user = customBizData4.getUser()) != null) {
            i = user.getFollowStatus();
        } else {
            i = -1;
        }
        C77357UXp.LJJIJIIJIL(skylightBaseTemplateCell, str, str2, i, null, null, 50);
    }
}
