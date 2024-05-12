package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.gamora.editorpro.audio.AudioRecordActivityViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editorpro.audio.AudioRecordActivityViewModel", f = "AudioRecordActivityViewModel.kt", l = {255}, m = "getComposeAudioPath")
/* renamed from: X.5FW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5FW extends C3CS {
    public AudioRecordActivityViewModel LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ AudioRecordActivityViewModel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5FW(AudioRecordActivityViewModel audioRecordActivityViewModel, InterfaceC67352kd<? super C5FW> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = audioRecordActivityViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.jv0(null, this);
    }
}
