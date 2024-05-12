package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadStateViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.3vl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99733vl {
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(C99793vr.LJLIL);
    public final InterfaceC88472Yns<LEA, C76800UCe> LIZ;
    public final InterfaceC88474Ynu<String, Boolean, Boolean, Boolean, InterfaceC99713vj> LIZIZ;
    public final boolean LIZJ;
    public final ConcurrentHashMap<String, InterfaceC99713vj> LIZLLL;
    public final AtomicBoolean LJ;
    public final C99773vp LJFF;

    public C99733vl() {
        this(null);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.3vp] */
    public C99733vl(Object obj) {
        C99763vo addLoginLogOutListener = C99763vo.LJLIL;
        C99723vk c99723vk = new C99723vk(C99783vq.LIZ);
        boolean z = ReadStateViewModel.LJLJL;
        o.LJIIIZ(addLoginLogOutListener, "addLoginLogOutListener");
        this.LIZ = addLoginLogOutListener;
        this.LIZIZ = c99723vk;
        this.LIZJ = z;
        this.LIZLLL = new ConcurrentHashMap<>();
        this.LJ = new AtomicBoolean(false);
        this.LJFF = new LEA() { // from class: X.3vp
            @Override // X.LEA
            public final void onAccountResult(int i, boolean z2, int i2, User user) {
                if (!z2) {
                    return;
                }
                if (i != 2 && i != 3) {
                    return;
                }
                C99733vl.this.LIZLLL.clear();
            }
        };
    }

    public final void LIZ(C98593tv enterChatParams) {
        o.LJIIIZ(enterChatParams, "enterChatParams");
        boolean z = false;
        if (this.LJ.compareAndSet(false, true)) {
            this.LIZ.invoke(this.LJFF);
        }
        String sessionId = enterChatParams.getSessionId();
        if (sessionId == null) {
            return;
        }
        ConcurrentHashMap<String, InterfaceC99713vj> concurrentHashMap = this.LIZLLL;
        if (concurrentHashMap.get(sessionId) == null) {
            if (enterChatParams.getChatType() == 3) {
                z = true;
            }
            boolean isReportPage = enterChatParams.isReportPage();
            concurrentHashMap.putIfAbsent(sessionId, this.LIZIZ.invoke(sessionId, Boolean.valueOf(this.LIZJ), Boolean.valueOf(z), Boolean.valueOf(isReportPage)));
        }
    }
}
