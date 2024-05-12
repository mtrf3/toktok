package X;

import com.bytedance.ies.actionai.jni.ActionExecuteCallback;

/* renamed from: X.Woc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83422Woc implements InterfaceC83373Wnp<Integer, Boolean> {
    public final /* synthetic */ C83427Woh<I> LIZ;
    public final /* synthetic */ C83429Woj<I> LIZIZ;
    public final /* synthetic */ ActionExecuteCallback LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC83373Wnp
    public final Boolean invoke(Integer num) {
        int intValue = num.intValue();
        this.LIZ.LJLIL.eO(new C83361Wnd(EnumC83360Wnc.START_EXECUTE, -1));
        C45241HpF c45241HpF = new C45241HpF(this.LIZIZ.LIZ, Integer.valueOf(intValue), this.LIZIZ.LIZLLL);
        XKQ xkq = this.LIZ.LJLJJI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LIZ.LJLJJI = XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C83423Wod(this.LIZ, this.LIZJ, c45241HpF, intValue, null), 3);
        return Boolean.TRUE;
    }

    public C83422Woc(C83427Woh<I> c83427Woh, C83429Woj<I> c83429Woj, ActionExecuteCallback actionExecuteCallback) {
        this.LIZ = c83427Woh;
        this.LIZIZ = c83429Woj;
        this.LIZJ = actionExecuteCallback;
    }
}
