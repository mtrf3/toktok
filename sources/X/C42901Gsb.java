package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.Gsb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42901Gsb implements InterfaceC156736Dd {
    public final List<InterfaceC156726Dc> LIZ = new ArrayList();

    public static final String LIZIZ() {
        StringBuilder sb = new StringBuilder();
        if (AnchorListManager.LJI() != null) {
            Iterator it = ((ArrayList) AnchorListManager.LJFF()).iterator();
            while (it.hasNext()) {
                if (((AnchorPublishStruct) it.next()).hadNew) {
                    sb.append("1");
                } else {
                    sb.append(CardStruct.IStatusCode.DEFAULT);
                }
                sb.append(",");
            }
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static final boolean LIZJ() {
        if (AnchorListManager.LJI > 0) {
            return true;
        }
        return false;
    }

    public C42901Gsb() {
        EventBus.LIZJ().LJIILJJIL(this);
    }

    public static final String LIZ(int[] types) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        if (AnchorListManager.LJI() != null) {
            Iterator it = ((ArrayList) AnchorListManager.LJFF()).iterator();
            while (it.hasNext()) {
                AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) it.next();
                int i = anchorPublishStruct.type;
                EnumC42934Gt8 enumC42934Gt8 = EnumC42934Gt8.ANCHOR_SHOP_LINK;
                if (i == enumC42934Gt8.getTYPE()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    o.LJIIIZ(types, "types");
                    if (!ORY.LJJIJ(enumC42934Gt8.getTYPE(), types)) {
                    }
                }
                int i2 = anchorPublishStruct.type;
                EnumC42934Gt8 enumC42934Gt82 = EnumC42934Gt8.UG_PICK;
                if (i2 == enumC42934Gt82.getTYPE()) {
                    o.LJIIIZ(types, "types");
                    if (!ORY.LJJIJ(enumC42934Gt82.getTYPE(), types)) {
                    }
                }
                int i3 = anchorPublishStruct.type;
                EnumC42934Gt8 enumC42934Gt83 = EnumC42934Gt8.MUSIC_PLAYLIST;
                if (i3 == enumC42934Gt83.getTYPE()) {
                    o.LJIIIZ(types, "types");
                    if (!ORY.LJJIJ(enumC42934Gt83.getTYPE(), types)) {
                    }
                }
                int i4 = anchorPublishStruct.type;
                EnumC42934Gt8 enumC42934Gt84 = EnumC42934Gt8.HYPIC_ANCHOR;
                if (i4 == enumC42934Gt84.getTYPE()) {
                    o.LJIIIZ(types, "types");
                    if (!ORY.LJJIJ(enumC42934Gt84.getTYPE(), types)) {
                    }
                }
                sb.append(AnchorListManager.LJII(anchorPublishStruct));
                sb.append(",");
            }
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public void onAsyncAnchor(C7TR c7tr) {
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC156726Dc) it.next()).LIZ(c7tr.LJLIL);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public void onWikiActivityClose(C42910Gsk c42910Gsk) {
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC156726Dc) it.next()).LIZ(null);
        }
    }

    public static final void LIZLLL(Context context, java.util.Map<String, String> params) {
        List LJFF = AnchorListManager.LJFF();
        for (int i = 0; i < ((ArrayList) LJFF).size(); i++) {
            AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) ListProtector.get(LJFF, i);
            if (anchorPublishStruct.type == EnumC42934Gt8.WIKIPEDIA.getTYPE()) {
                String str = anchorPublishStruct.webUrl;
                if (str == null) {
                    str = "";
                }
                o.LJIIIZ(context, "context");
                o.LJIIIZ(params, "params");
                C59974NgI.LIZ(context, str, params, C113554cx.LJJJLIIL());
                return;
            }
        }
    }
}
