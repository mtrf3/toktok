package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.audio.AudioRecordActivityViewModel;
import com.ss.ugc.android.editor.core.EditorProContext;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editorpro.audio.AudioRecordActivityViewModel", f = "AudioRecordActivityViewModel.kt", l = {121}, m = "saveRecordedAudioToEditModel")
/* renamed from: X.5FV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5FV extends C3CS {
    public AudioRecordActivityViewModel LJLIL;
    public VideoPublishEditModel LJLILLLLZI;
    public EditorProContext LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ AudioRecordActivityViewModel LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5FV(AudioRecordActivityViewModel audioRecordActivityViewModel, InterfaceC67352kd<? super C5FV> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = audioRecordActivityViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.kv0(null, null, null, this);
    }
}
