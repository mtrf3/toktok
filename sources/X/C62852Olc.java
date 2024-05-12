package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Olc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62852Olc implements InterfaceC86963bA<List<? extends C109544Rq>> {
    public final /* synthetic */ C62853Old LIZ;
    public final /* synthetic */ List<C109544Rq> LIZIZ;
    public final /* synthetic */ List<C109544Rq> LIZJ;
    public final /* synthetic */ List<C109544Rq> LIZLLL;

    @Override // X.InterfaceC86963bA
    public final void LIZIZ(C63623Oy3 c63623Oy3) {
        C62853Old c62853Old = this.LIZ;
        List<C109544Rq> list = this.LIZIZ;
        c62853Old.getClass();
        C62853Old.LJ(list, false);
        this.LIZ.LJIIIZ.set(false);
    }

    @Override // X.InterfaceC86963bA
    public final void onSuccess(List<? extends C109544Rq> list) {
        List<? extends C109544Rq> messageList = list;
        o.LJIIIZ(messageList, "messageList");
        C62853Old c62853Old = this.LIZ;
        List<C109544Rq> list2 = this.LIZIZ;
        c62853Old.getClass();
        C62853Old.LJ(list2, true);
        this.LIZ.LJIIIZ.set(false);
        if (!this.LIZJ.isEmpty()) {
            this.LIZ.LJI.LIZ();
        }
        if (!this.LIZLLL.isEmpty()) {
            this.LIZ.LJFF.LIZ();
        }
        C62853Old c62853Old2 = this.LIZ;
        ArrayList arrayList = new ArrayList();
        for (C109544Rq c109544Rq : messageList) {
            C109544Rq c109544Rq2 = c109544Rq;
            c62853Old2.getClass();
            if (o.LJ(c109544Rq2.getLocalExt().get("s:msg_error_code"), "100022") && (c109544Rq2.getMsgType() == 1805 || c109544Rq2.getMsgType() == 1809)) {
                arrayList.add(c109544Rq);
            }
        }
        if (!arrayList.isEmpty()) {
            this.LIZ.LIZLLL().LIZJ(arrayList);
        }
        if (!this.LIZ.LJFF.LIZIZ.isEmpty() || !this.LIZ.LJI.LIZIZ.isEmpty() || !this.LIZ.LIZLLL().LIZIZ.isEmpty()) {
            this.LIZ.LJIIIIZZ.onNext(1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C62852Olc(C62853Old c62853Old, List<? extends C109544Rq> list, List<? extends C109544Rq> list2, List<? extends C109544Rq> list3) {
        this.LIZ = c62853Old;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = list3;
    }
}
