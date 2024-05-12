package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.MusicServiceImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class I9U implements C7IG {
    public final /* synthetic */ MusicServiceImpl LIZ;
    public final /* synthetic */ InterfaceC88472Yns<C145355n9, C76800UCe> LIZIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZJ;

    @Override // X.C7IG
    public final void LIZ(int i, Intent intent) {
        Boolean bool;
        String str;
        Serializable serializable;
        String str2;
        AVMusic LIZ;
        if (i == -1) {
            Serializable serializable2 = null;
            if (intent != null) {
                bool = Boolean.valueOf(intent.getBooleanExtra("is_cancel_current_choose_music", false));
                str = C16880lQ.LLJJIJIIJIL(intent, "path");
                serializable = intent.getSerializableExtra("music_model");
            } else {
                bool = null;
                str = null;
                serializable = null;
            }
            MusicModel musicModel = (MusicModel) serializable;
            if (intent != null) {
                str2 = C16880lQ.LLJJIJIIJIL(intent, "music_origin");
                serializable2 = intent.getSerializableExtra("extra_log_params");
            } else {
                str2 = null;
            }
            HashMap hashMap = (HashMap) serializable2;
            if (musicModel != null) {
                int musicDuration = this.LIZ.getMusicDuration(str);
                if (musicModel.isLocalMusic()) {
                    new I9Q();
                    this.LIZ.getClass();
                    musicModel.setLocalPath(str);
                    UrlModel urlModel = new UrlModel();
                    urlModel.setUri(str);
                    ArrayList arrayList = new ArrayList();
                    if (str != null) {
                        arrayList.add(str);
                    }
                    urlModel.setUrlList(arrayList);
                    musicModel.setUrl(urlModel);
                    LIZ = I9Q.LIZ(musicModel);
                } else {
                    new I9Q();
                    LIZ = I9Q.LIZ(musicModel);
                }
                if (LIZ != null) {
                    LIZ.setDuration(musicDuration);
                }
                InterfaceC88472Yns<C145355n9, C76800UCe> interfaceC88472Yns = this.LIZIZ;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(C145385nC.LIZ(bool, str2, LIZ, str, hashMap, 0L, 0L, 96));
                    return;
                }
                return;
            }
            InterfaceC88472Yns<C145355n9, C76800UCe> interfaceC88472Yns2 = this.LIZIZ;
            if (interfaceC88472Yns2 == null) {
                return;
            }
            interfaceC88472Yns2.invoke(C145385nC.LIZ(bool, str2, null, str, hashMap, 0L, 0L, 96));
            return;
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZJ;
        if (interfaceC65784Pro == null) {
            return;
        }
        interfaceC65784Pro.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public I9U(MusicServiceImpl musicServiceImpl, InterfaceC88472Yns<? super C145355n9, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LIZ = musicServiceImpl;
        this.LIZIZ = interfaceC88472Yns;
        this.LIZJ = interfaceC65784Pro;
    }
}
