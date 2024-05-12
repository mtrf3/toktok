package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3T5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3T5 implements InterfaceC82853Mz {
    public final CharSequence LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    @Override // X.InterfaceC82853Mz
    public final String LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC82853Mz
    public final String LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC82853Mz
    public final InterfaceC82723Mm LIZJ(InterfaceC82723Mm sessionVO) {
        o.LJIIIZ(sessionVO, "sessionVO");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("try to update: ");
        LIZ.append(sessionVO.getName());
        LIZ.append(": ");
        LIZ.append(sessionVO.getClass());
        C81843Jc.LIZIZ("SessionRefactor-SessionVOTypingDecorator", X1D.LIZIZ(LIZ));
        if (sessionVO instanceof C3TO) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("updateVO: isShowingTypingStatus:");
            LIZ2.append(this.LIZIZ);
            LIZ2.append(" typingStatusText:");
            LIZ2.append((Object) this.LIZ);
            C81843Jc.LIZIZ("SessionRefactor-SessionVOTypingDecorator", X1D.LIZIZ(LIZ2));
            C3TO c3to = (C3TO) sessionVO;
            c3to.setShowingTypingStatus(this.LIZIZ);
            c3to.setTypingStatusText(this.LIZ);
            if (this.LIZIZ) {
                C82543Lu LIZ3 = C3K3.LIZ();
                String sessionId = this.LIZJ;
                LIZ3.getClass();
                o.LJIIIZ(sessionId, "sessionId");
                if (LIZ3.LJZL.contains(sessionId)) {
                    C32O.LIZ(2, this.LIZJ);
                }
            }
        }
        return sessionVO;
    }

    public C3T5(CharSequence charSequence, String targetSessionId, boolean z) {
        o.LJIIIZ(targetSessionId, "targetSessionId");
        this.LIZ = charSequence;
        this.LIZIZ = z;
        this.LIZJ = targetSessionId;
        this.LIZLLL = "SessionVOTypingDecorator-Operation";
    }
}
