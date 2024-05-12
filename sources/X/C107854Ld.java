package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMMessage;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4Ld, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C107854Ld extends TBS implements InterfaceC65784Pro<Boolean> {
    public C107854Ld(Object obj) {
        super(0, obj, C107834Lb.class, "isLastReceivedMessageTextMessage", "isLastReceivedMessageTextMessage()Z", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Integer valueOf;
        int i;
        C107834Lb c107834Lb = (C107834Lb) this.receiver;
        Iterator it = ((List) c107834Lb.LJI.getValue()).iterator();
        if (!it.hasNext()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((RecyclerView.ViewHolder) it.next()).getLayoutPosition());
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(((RecyclerView.ViewHolder) it.next()).getLayoutPosition());
                if (valueOf.compareTo(valueOf2) > 0) {
                    valueOf = valueOf2;
                }
            }
        }
        int i2 = -1;
        if (valueOf != null) {
            i = valueOf.intValue();
        } else {
            i = -1;
        }
        AbstractC1029742j abstractC1029742j = c107834Lb.LIZ;
        AqS167S0100000_1 aqS167S0100000_1 = new AqS167S0100000_1(c107834Lb, 517);
        abstractC1029742j.getClass();
        List<IMMessage> currentList = abstractC1029742j.getCurrentList();
        o.LJIIIIZZ(currentList, "this.currentList");
        Iterator<IMMessage> it2 = currentList.iterator();
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (((Boolean) aqS167S0100000_1.invoke(it2.next().getMessage())).booleanValue()) {
                i2 = i3;
                break;
            }
            i3++;
        }
        C34B.LIZIZ("SwipeForReplyIntroductionHelper", "lastReceivedTextMessagePosition: " + i + "; lastReceivedMessageDataPosition: " + i2);
        if (i == i2 && i2 == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
