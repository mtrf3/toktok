package X;

import Y.AfS53S0100000_1;
import android.app.Activity;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.avatar.ChangAvatarActionStage$loadMusic$2$1$1", f = "ChangAvatarActionStage.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2mT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68492mT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Activity LJLIL;
    public final /* synthetic */ VideoPublishEditModel LJLILLLLZI;
    public final /* synthetic */ InterfaceC67352kd<Boolean> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C68492mT(Activity activity, VideoPublishEditModel videoPublishEditModel, InterfaceC67352kd<? super Boolean> interfaceC67352kd, InterfaceC67352kd<? super C68492mT> interfaceC67352kd2) {
        super(2, interfaceC67352kd2);
        this.LJLIL = activity;
        this.LJLILLLLZI = videoPublishEditModel;
        this.LJLJI = interfaceC67352kd;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C68492mT(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C162466Ze c162466Ze = new C162466Ze();
        Activity context = this.LJLIL;
        VideoPublishEditModel videoPublishEditModel = this.LJLILLLLZI;
        o.LJIIIZ(context, "context");
        c162466Ze.LIZIZ = videoPublishEditModel;
        c162466Ze.LIZJ = context;
        final VideoPublishEditModel videoPublishEditModel2 = this.LJLILLLLZI;
        final InterfaceC67352kd<Boolean> interfaceC67352kd = this.LJLJI;
        c162466Ze.LIZ(null, new InterfaceC149485to() { // from class: X.5IT
            @Override // X.InterfaceC149485to
            public final MusicBuzModel LIZIZ() {
                return VideoPublishEditModel.this.creativeModel.musicBuzModel;
            }

            @Override // X.InterfaceC149485to
            public final void LIZ(AVMusic aVMusic) {
                String str;
                I9T.LJI(aVMusic, false, VideoPublishEditModel.this.creativeModel.musicBuzModel);
                VideoPublishEditModel videoPublishEditModel3 = VideoPublishEditModel.this;
                if (aVMusic != null) {
                    str = aVMusic.path;
                } else {
                    str = null;
                }
                videoPublishEditModel3.setMMusicPath(str);
                VideoPublishEditModel videoPublishEditModel4 = VideoPublishEditModel.this;
                videoPublishEditModel4.musicVolume = 1.0f;
                videoPublishEditModel4.setMusicOrigin("profile_photo");
                InterfaceC67352kd<Boolean> interfaceC67352kd2 = interfaceC67352kd;
                Boolean bool = Boolean.TRUE;
                C3C5.m7constructorimpl(bool);
                interfaceC67352kd2.resumeWith(bool);
            }
        }, false).LJJJLIIL(new AfS53S0100000_1(this.LJLILLLLZI, 81), new AfS53S0100000_1(this.LJLJI, 82));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
