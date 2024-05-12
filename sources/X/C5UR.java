package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.operate.restore.DraftCreativeRestoreHandlerKt", f = "DraftCreativeRestoreHandler.kt", l = {144}, m = "splitRecordAudioIfNeeded")
/* renamed from: X.5UR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5UR extends C3CS {
    public AwemeDraft LJLIL;
    public NLEEditor LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public int LJLJJI;

    public C5UR(InterfaceC67352kd<? super C5UR> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C168796jr.LIZLLL(null, null, this);
    }
}
