package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import java.util.PriorityQueue;

/* renamed from: X.Xxf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86531Xxf extends AbstractC65781Prl implements InterfaceC65784Pro<PriorityQueue<InnerPushMessage>> {
    public static final C86531Xxf LJLIL = new C86531Xxf();

    public C86531Xxf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final PriorityQueue<InnerPushMessage> invoke() {
        return new PriorityQueue<>(11, new C86525XxZ());
    }
}
