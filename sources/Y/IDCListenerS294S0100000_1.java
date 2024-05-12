package Y;

import X.ActivityC45651qj;
import X.AnonymousClass470;
import X.C1044548b;
import X.C109544Rq;
import X.C111764a4;
import X.C111774a5;
import X.C1DG;
import X.C3K3;
import X.C3OZ;
import X.C4A0;
import X.C6ZT;
import X.C81843Jc;
import X.C82543Lu;
import X.C88033ct;
import X.C92183ja;
import X.C93793mB;
import X.EnumC95013o9;
import X.InterfaceC82723Mm;
import X.ViewOnLongClickListenerC94813np;
import X.X1D;
import android.view.View;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist.VideoStickerContentCell;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListBaseVH;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDCListenerS294S0100000_1 implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            case 3:
                return onLongClick$3(this, view);
            case 4:
                return onLongClick$4(this, view);
            case 5:
                return onLongClick$5(this, view);
            default:
                return false;
        }
    }

    public IDCListenerS294S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onLongClick$0(IDCListenerS294S0100000_1 iDCListenerS294S0100000_1, View view) {
        Integer num;
        if (C6ZT.LIZIZ(view, 500L)) {
            return false;
        }
        if (((VideoStickerContentCell) iDCListenerS294S0100000_1.l0).N()) {
            VideoStickerContentCell videoStickerContentCell = (VideoStickerContentCell) iDCListenerS294S0100000_1.l0;
            C88033ct lv0 = videoStickerContentCell.Q().lv0();
            if (lv0 != null) {
                num = Integer.valueOf(lv0.LJLILLLLZI);
            } else {
                num = null;
            }
            videoStickerContentCell.f0(num);
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$1(IDCListenerS294S0100000_1 iDCListenerS294S0100000_1, View view) {
        ActivityC45651qj LJ;
        InterfaceC82723Mm interfaceC82723Mm = ((SessionListBaseVH) iDCListenerS294S0100000_1.l0).LJLLILLLL;
        if (interfaceC82723Mm == null) {
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("long clicked: ");
        LIZ.append(interfaceC82723Mm.getName());
        C81843Jc.LIZIZ("SessionRefactor-SessionListBaseVH", X1D.LIZIZ(LIZ));
        C3K3.LIZ().getClass();
        C3OZ LJFF = C82543Lu.LJFF(interfaceC82723Mm);
        if (LJFF == null || (LJ = C1DG.LJ(((SessionListBaseVH) iDCListenerS294S0100000_1.l0).itemView, "itemView.context")) == null) {
            return true;
        }
        LJFF.LIZJ(LJ, interfaceC82723Mm.getSessionId());
        return true;
    }

    public static final boolean onLongClick$2(IDCListenerS294S0100000_1 iDCListenerS294S0100000_1, View view) {
        C1044548b.LIZ = false;
        return ((C111774a5) iDCListenerS294S0100000_1.l0).LJLJI.LIZ.performLongClick();
    }

    public static final boolean onLongClick$3(IDCListenerS294S0100000_1 iDCListenerS294S0100000_1, View view) {
        C1044548b.LIZ = false;
        return ((C111764a4) iDCListenerS294S0100000_1.l0).getRootView().findViewById(R.id.bst).performLongClick();
    }

    public static final boolean onLongClick$4(IDCListenerS294S0100000_1 iDCListenerS294S0100000_1, View view) {
        AnonymousClass470 anonymousClass470 = ((C4A0) iDCListenerS294S0100000_1.l0).LJLJJI;
        if (anonymousClass470 != null) {
            return anonymousClass470.LIZ.performLongClick();
        }
        return false;
    }

    public static final boolean onLongClick$5(IDCListenerS294S0100000_1 iDCListenerS294S0100000_1, View v) {
        Integer num;
        BaseContent baseContent;
        C109544Rq c109544Rq;
        o.LJIIIZ(v, "v");
        C92183ja c92183ja = (C92183ja) iDCListenerS294S0100000_1.l0;
        ChatRoomViewModel chatRoomViewModel = c92183ja.LJIIIZ;
        if ((chatRoomViewModel != null && chatRoomViewModel.LJZ == EnumC95013o9.DISABLED) || c92183ja.LJIIIIZZ) {
            return false;
        }
        Object tag = v.getTag(50331648);
        BaseTemplate baseTemplate = null;
        if (tag instanceof Integer) {
            num = (Integer) tag;
        } else {
            num = null;
        }
        Object tag2 = v.getTag(100663296);
        if (tag2 instanceof BaseContent) {
            baseContent = (BaseContent) tag2;
        } else {
            baseContent = null;
        }
        Object tag3 = v.getTag(134217728);
        if (tag3 instanceof C109544Rq) {
            c109544Rq = (C109544Rq) tag3;
        } else {
            c109544Rq = null;
        }
        Object tag4 = v.getTag(150994944);
        if (tag4 instanceof BaseTemplate) {
            baseTemplate = (BaseTemplate) tag4;
        }
        if (num == null) {
            return false;
        }
        if (num.intValue() == 110) {
            num = 1;
        }
        if (c109544Rq != null && !C93793mB.LIZLLL(c109544Rq)) {
            C92183ja c92183ja2 = (C92183ja) iDCListenerS294S0100000_1.l0;
            c92183ja2.LJIIIIZZ = true;
            new ViewOnLongClickListenerC94813np(c109544Rq, baseContent, num.intValue(), c92183ja2, v, baseTemplate).onLongClick(v);
        }
        return false;
    }
}
