package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.editpost.EditPostPermission;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicEditResponse;
import com.ss.android.ugc.aweme.music.model.MusicEditResult;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.edit.ReplaceMusicRequest;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.Glb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42467Glb<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ DialogC25756A8y LIZ;
    public final /* synthetic */ C1537661s LIZIZ;
    public final /* synthetic */ C188727au LIZJ;
    public final /* synthetic */ AVMusic LIZLLL;
    public final /* synthetic */ boolean LJ;
    public final /* synthetic */ ReplaceMusicRequest LJFF;

    public C42467Glb(DialogC25756A8y dialogC25756A8y, C1537661s c1537661s, C188727au c188727au, AVMusic aVMusic, boolean z, ReplaceMusicRequest replaceMusicRequest) {
        this.LIZ = dialogC25756A8y;
        this.LIZIZ = c1537661s;
        this.LIZJ = c188727au;
        this.LIZLLL = aVMusic;
        this.LJ = z;
        this.LJFF = replaceMusicRequest;
    }

    @Override // X.C10I
    public final Object then(C10K task) {
        String str;
        Activity[] activityArr;
        ActivityC45651qj LJJIFFI;
        o.LJIIIZ(task, "task");
        if (task.LJIILJJIL() || task.LJIIL()) {
            DialogC25756A8y dialogC25756A8y = this.LIZ;
            if (dialogC25756A8y != null) {
                V1B.LJLILLLLZI(dialogC25756A8y);
            }
            Activity activity = this.LIZIZ.mActivity;
            if (activity != null) {
                C24540xm.LIZ(R.string.jks, activity, 3039);
            }
            this.LIZJ.LIZLLL(0, "replace_status");
        } else if (task.LJIILIIL()) {
            if (((BaseResponse) task.LJIIJJI()).status_code == 0) {
                DialogC25756A8y dialogC25756A8y2 = this.LIZ;
                if (dialogC25756A8y2 != null) {
                    V1B.LJLILLLLZI(dialogC25756A8y2);
                }
                this.LIZJ.LIZLLL(1, "replace_status");
                AVMusic avMusic = this.LIZLLL;
                o.LJIIIZ(avMusic, "avMusic");
                Music convertToMusic = I9S.LIZ(avMusic).convertToMusic();
                o.LJIIIIZZ(convertToMusic, "musicModel.convertToMusic()");
                EditPostPermission editPostPermission = null;
                if (this.LJ) {
                    Intent intent = new Intent();
                    intent.putExtra("extra_replace_music_info", convertToMusic);
                    if (((MusicEditResponse) task.LJIIJJI()).musicEditResult != null) {
                        MusicEditResult musicEditResult = ((MusicEditResponse) task.LJIIJJI()).musicEditResult;
                        if (musicEditResult != null) {
                            editPostPermission = musicEditResult.editPostPermission;
                        }
                        intent.putExtra("extra_replace_music_permission_info", editPostPermission);
                    }
                    Activity activity2 = this.LIZIZ.mActivity;
                    if (activity2 != null) {
                        activity2.setResult(-1, intent);
                    }
                    Activity activity3 = this.LIZIZ.mActivity;
                    if (activity3 != null) {
                        activity3.finish();
                    }
                } else {
                    this.LIZIZ.LLJILJIL();
                    IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                    o.LJIIIIZZ(createIAVServiceProxybyMonsterPlugin, "get().getService(IAVServiceProxy::class.java)");
                    synchronized (C42470Gle.class) {
                        LinkedList<Activity> linkedList = C42470Gle.LJFF;
                        activityArr = (Activity[]) linkedList.toArray(new Activity[linkedList.size()]);
                    }
                    Context context = (Context) Arrays.stream(activityArr).filter(C42468Glc.LIZ).findFirst().orElse(null);
                    if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
                        ReplaceMusicRequest replaceMusicRequest = this.LJFF;
                        createIAVServiceProxybyMonsterPlugin.getApplicationService();
                        C45039Hlz.LIZJ(LJJIFFI, new OSZ(replaceMusicRequest.getItemID(), convertToMusic));
                        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                        creativeToastBuilder.messageRes(R.string.e06);
                        creativeToastBuilder.icon(R.raw.icon_tick_fill_small);
                        creativeToastBuilder.iconColorRes(R.attr.e8);
                        C78915Uy7.LJJIIZI(LJJIFFI, 3035, creativeToastBuilder);
                    }
                }
            } else {
                this.LIZJ.LIZLLL(0, "replace_status");
                DialogC25756A8y dialogC25756A8y3 = this.LIZ;
                if (dialogC25756A8y3 != null) {
                    V1B.LJLILLLLZI(dialogC25756A8y3);
                }
                Activity activity4 = this.LIZIZ.mActivity;
                if (activity4 != null) {
                    C24540xm.LIZ(R.string.jks, activity4, 3039);
                }
            }
        }
        if (this.LJ) {
            str = "publish_edit_music_status";
        } else {
            str = "publish_replace_music_status";
        }
        FMX.LJIIL(str, this.LIZJ.LIZ);
        return C76800UCe.LIZ;
    }
}
