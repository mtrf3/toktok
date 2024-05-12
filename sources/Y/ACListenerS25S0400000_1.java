package Y;

import X.C109544Rq;
import X.C26045AKb;
import X.C63724Ozg;
import X.C68322mC;
import X.C78857UxB;
import X.C89673fX;
import X.C89853fp;
import X.C89903fu;
import X.C91853j3;
import X.C91913j9;
import X.C92183ja;
import X.C99033ud;
import X.EnumC89943fy;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ACListenerS25S0400000_1 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$0(ACListenerS25S0400000_1 aCListenerS25S0400000_1, View view) {
        if (!((C89903fu) aCListenerS25S0400000_1.l0).LJLJL.isSelected()) {
            C89853fp c89853fp = ((C89673fX) aCListenerS25S0400000_1.l1).LJLIL;
            if (c89853fp.LJIIJJI.size() + c89853fp.LIZLLL >= c89853fp.LJFF()) {
                C26045AKb c26045AKb = new C26045AKb(((C89903fu) aCListenerS25S0400000_1.l0).LJLIL);
                c26045AKb.LJIIIZ(((C89903fu) aCListenerS25S0400000_1.l0).LJLIL.getContext().getString(R.string.poe, String.valueOf(((C89673fX) aCListenerS25S0400000_1.l1).LJLIL.LJFF())));
                c26045AKb.LIZLLL(3000L);
                c26045AKb.LJIIJ();
                return;
            }
        }
        TuxIconView tuxIconView = ((C89903fu) aCListenerS25S0400000_1.l0).LJLJL;
        tuxIconView.setSelected(true ^ tuxIconView.isSelected());
        if (((C89903fu) aCListenerS25S0400000_1.l0).LJLJL.isSelected()) {
            ((C89673fX) aCListenerS25S0400000_1.l1).LJLIL.LIZ((IMUser) aCListenerS25S0400000_1.l2, (EnumC89943fy) ((C68322mC) aCListenerS25S0400000_1.l3).element);
        } else {
            ((C89673fX) aCListenerS25S0400000_1.l1).LJLIL.LJIIIIZZ((IMUser) aCListenerS25S0400000_1.l2);
        }
    }

    public static final void onClick$1(ACListenerS25S0400000_1 aCListenerS25S0400000_1, View clickView) {
        String str;
        o.LJIIIZ(clickView, "clickView");
        if (((BaseContent) aCListenerS25S0400000_1.l0) instanceof TextContent) {
            Context context = clickView.getContext();
            o.LJIIIIZZ(context, "clickView.context");
            TextContent content = (TextContent) ((BaseContent) aCListenerS25S0400000_1.l0);
            o.LJIIIZ(content, "content");
            String text = content.getText();
            if (text == null) {
                text = "";
            }
            C63724Ozg.LIZ(context, text);
            Activity topActivity = ActivityStack.getTopActivity();
            o.LJIIIIZZ(topActivity, "this");
            C26045AKb c26045AKb = new C26045AKb(topActivity);
            c26045AKb.LJIIIIZZ(R.string.en4);
            c26045AKb.LJIIJ();
        } else {
            Object tag = ((View) aCListenerS25S0400000_1.l1).getTag(150994946);
            if ((tag instanceof String) && (str = (String) tag) != null && C78857UxB.LJJJIL(str)) {
                Context context2 = clickView.getContext();
                o.LJIIIIZZ(context2, "clickView.context");
                C63724Ozg.LIZ(context2, str);
                Activity topActivity2 = ActivityStack.getTopActivity();
                o.LJIIIIZZ(topActivity2, "this");
                C26045AKb c26045AKb2 = new C26045AKb(topActivity2);
                c26045AKb2.LJIIIIZZ(R.string.en4);
                c26045AKb2.LJIIJ();
            }
        }
        if (((C92183ja) aCListenerS25S0400000_1.l2).LIZ.isTakoChat$im_base_release()) {
            String enterFromForMob = ((C92183ja) aCListenerS25S0400000_1.l2).LIZ.getEnterFromForMob();
            String enterMethod = ((C92183ja) aCListenerS25S0400000_1.l2).LIZ.getEnterMethod();
            String searchId = ((C92183ja) aCListenerS25S0400000_1.l2).LIZ.getSearchId();
            String uuid = ((C109544Rq) aCListenerS25S0400000_1.l3).getUuid();
            uuid.toString();
            C91853j3.LIZIZ(enterFromForMob, enterMethod, searchId, uuid, ((C92183ja) aCListenerS25S0400000_1.l2).LIZ.getConversationId(), "copy");
        } else {
            C91853j3.LIZ(((C92183ja) aCListenerS25S0400000_1.l2).LIZ.isGroupChat(), "copy");
        }
        ((C92183ja) aCListenerS25S0400000_1.l2).LIZ();
    }

    public static final void onClick$2(ACListenerS25S0400000_1 aCListenerS25S0400000_1, View view) {
        o.LJIIIZ(view, "view");
        ((C92183ja) aCListenerS25S0400000_1.l0).LIZLLL.setValue(1);
        C99033ud c99033ud = ((C92183ja) aCListenerS25S0400000_1.l0).LIZ;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        C91913j9.LIZ(c99033ud, context, (BaseContent) aCListenerS25S0400000_1.l1, (BaseTemplate) aCListenerS25S0400000_1.l2, (C109544Rq) aCListenerS25S0400000_1.l3);
        if (((C92183ja) aCListenerS25S0400000_1.l0).LIZ.isTakoChat$im_base_release()) {
            String enterFromForMob = ((C92183ja) aCListenerS25S0400000_1.l0).LIZ.getEnterFromForMob();
            String enterMethod = ((C92183ja) aCListenerS25S0400000_1.l0).LIZ.getEnterMethod();
            String searchId = ((C92183ja) aCListenerS25S0400000_1.l0).LIZ.getSearchId();
            String uuid = ((C109544Rq) aCListenerS25S0400000_1.l3).getUuid();
            uuid.toString();
            C91853j3.LIZIZ(enterFromForMob, enterMethod, searchId, uuid, ((C92183ja) aCListenerS25S0400000_1.l0).LIZ.getConversationId(), "forward");
        } else {
            C91853j3.LIZ(((C92183ja) aCListenerS25S0400000_1.l0).LIZ.isGroupChat(), "forward");
        }
        ((C92183ja) aCListenerS25S0400000_1.l0).LIZ();
    }

    public ACListenerS25S0400000_1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }

    public ACListenerS25S0400000_1(C89903fu c89903fu, C89903fu c89903fu2, C89673fX c89673fX, IMUser iMUser, C68322mC<EnumC89943fy> c68322mC, int i) {
        this.$t = i;
        this.l0 = c89903fu;
        this.l1 = c89903fu2;
        this.l2 = c89673fX;
        this.l3 = iMUser;
    }
}
