package com.ss.android.ugc.aweme.music.ui;

import X.C16880lQ;
import X.C79004UzY;
import X.XZD;
import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes16.dex */
public class AIMusicDownloadPlayHelper extends MusicDownloadPlayHelper {
    public Toast LLFF;
    public final ArrayList<Integer> LLFFF;

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper
    public final void LJIIJJI(MusicModel musicModel) {
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, X.XUQ
    public final void onDestroy() {
        Downloader downloader = Downloader.getInstance(this.LJLIL.LJJIZ());
        if (!C79004UzY.LJJIFFI(this.LLFFF)) {
            Iterator<Integer> it = this.LLFFF.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (next != null) {
                    downloader.cancel(next.intValue());
                }
            }
        }
        super.onDestroy();
    }

    public AIMusicDownloadPlayHelper(XZD xzd) {
        super(xzd, "video_edit_page");
        this.LLFFF = new ArrayList<>();
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper
    public final boolean LIZ(MusicModel musicModel, Context context) {
        if (musicModel != null) {
            if (!musicModel.isLocalMusic() && !musicModel.isPlayUrlValid()) {
                String string = context.getString(R.string.iid);
                Toast toast = this.LLFF;
                if (toast != null) {
                    toast.cancel();
                }
                Toast makeText = Toast.makeText(context, string, 0);
                this.LLFF = makeText;
                if (makeText != null) {
                    makeText.setGravity(17, 0, 0);
                    C16880lQ.LLZILL(this.LLFF);
                }
                return false;
            }
            if (musicModel.getMusicStatus() == 0) {
                String offlineDesc = musicModel.getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = context.getString(R.string.iia);
                }
                Toast toast2 = this.LLFF;
                if (toast2 != null) {
                    toast2.cancel();
                }
                Toast makeText2 = Toast.makeText(context, offlineDesc, 0);
                this.LLFF = makeText2;
                if (makeText2 != null) {
                    makeText2.setGravity(17, 0, 0);
                    C16880lQ.LLZILL(this.LLFF);
                }
                return false;
            }
            return true;
        }
        return true;
    }
}
