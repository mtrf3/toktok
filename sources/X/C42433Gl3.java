package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.OriginalAudioStruct;
import com.ss.android.ugc.aweme.services.external.ui.ChangeBanMusicConfig;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.vesdk.VEUtils;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.external.ui.RecordServiceBaseImpl$startChangeBanMusic$1$1", f = "RecordServiceBaseImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Gl3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42433Gl3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ IRecordService.UICallback LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ Activity LJLJJI;
    public final /* synthetic */ ChangeBanMusicConfig LJLJJL;
    public final /* synthetic */ VEUtils.VEVideoFileInfo LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42433Gl3(IRecordService.UICallback uICallback, Aweme aweme, String str, Activity activity, ChangeBanMusicConfig changeBanMusicConfig, VEUtils.VEVideoFileInfo vEVideoFileInfo, InterfaceC67352kd<? super C42433Gl3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = uICallback;
        this.LJLILLLLZI = aweme;
        this.LJLJI = str;
        this.LJLJJI = activity;
        this.LJLJJL = changeBanMusicConfig;
        this.LJLJJLL = vEVideoFileInfo;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C42433Gl3(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        OriginalAudioStruct originalAudioStruct;
        String str;
        C141335gf.LIZJ(obj);
        IRecordService.UICallback uICallback = this.LJLIL;
        if (uICallback != null) {
            uICallback.postSuccess();
        }
        Intent intent = new Intent();
        ChangeBanMusicConfig changeBanMusicConfig = this.LJLJJL;
        VEUtils.VEVideoFileInfo vEVideoFileInfo = this.LJLJJLL;
        Aweme aweme = this.LJLILLLLZI;
        intent.putParcelableArrayListExtra("extra_import_video_info_list", C47261Igj.LJII(new ImportVideoInfo(0, 0, 0, 0, changeBanMusicConfig.getMp4Path(), 0L, 0L, null, null, 0, 0.0f, null, null, false, null, 32751, null)));
        if (vEVideoFileInfo != null) {
            num = new Integer(vEVideoFileInfo.duration);
        } else {
            num = null;
        }
        intent.putExtra("preview_video_length", num);
        intent.putExtra("shoot_way", "change_ban_music");
        intent.putExtra("enter_from", "music_replace_page");
        intent.putExtra("content_type", "replace_music");
        intent.putExtra("content_source", "replace_music");
        intent.putExtra("extra_edit_preview_info", (Parcelable) new C149505tq(0, 0, 15).LIZ(new EditVideoSegment(changeBanMusicConfig.getMp4Path(), changeBanMusicConfig.getVoicePath(), new VideoFileInfo(vEVideoFileInfo.width, vEVideoFileInfo.height, 0L, vEVideoFileInfo.fps, 0, 0, 0, 0, 0.0f, 496, null))));
        C77412UZs.LJJIJIL(intent, new CreativeInfo(changeBanMusicConfig.getCreationId(), 0, null, 6, null));
        intent.putExtra("is_sub_only_video", aweme.isSubOnlyVideo());
        if (changeBanMusicConfig.getVoicePath() != null && (originalAudioStruct = aweme.originalAudio) != null && (str = originalAudioStruct.vid) != null) {
            intent.putExtra("voice_vid", str);
        }
        if (this.LJLILLLLZI.getMusic() != null && !TextUtils.isEmpty(this.LJLILLLLZI.getMusic().getIdStr())) {
            intent.putExtra("music_id", this.LJLILLLLZI.getMusic().getIdStr());
        }
        if (o.LJ(this.LJLJI, "from_promote")) {
            intent.putExtra("extra_from_promote_music_replace", true);
        }
        if (!TextUtils.isEmpty(this.LJLILLLLZI.getAid()) && this.LJLILLLLZI.getVideo() != null && this.LJLILLLLZI.getVideo().getPlayAddr().getOriginUri() != null) {
            intent.putExtra("id", this.LJLILLLLZI.getAid());
            intent.putExtra("video_id", this.LJLILLLLZI.getVideo().getPlayAddr().getOriginUri());
            intent.putExtra("video_cover", (String) ListProtector.get(this.LJLILLLLZI.getVideo().getCover().getUrlList(), 0));
            VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startChangeBanMusicEditActivity(this.LJLJJI, intent);
            this.LJLJJI.finish();
        } else {
            this.LJLJJI.finish();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("awemetype=");
            LIZ.append(this.LJLILLLLZI.getAwemeType());
            H78.LIZIZ("changebanmusic", X1D.LIZIZ(LIZ));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
