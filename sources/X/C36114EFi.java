package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "dmt.av.video.record.RecordConditionCheck__RecordConditionCheckKt", f = "RecordConditionCheck.kt", l = {313, 314}, m = "cleanCacheForRecord$RecordConditionCheck__RecordConditionCheckKt")
/* renamed from: X.EFi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36114EFi extends C3CS {
    public C68322mC LJLIL;
    public C84661XKn LJLILLLLZI;
    public long LJLJI;
    public /* synthetic */ Object LJLJJI;
    public int LJLJJL;

    public C36114EFi(InterfaceC67352kd<? super C36114EFi> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C37284EkC.LIZ(null, null, false, this);
    }
}
