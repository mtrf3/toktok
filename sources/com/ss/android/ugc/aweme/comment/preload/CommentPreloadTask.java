package com.ss.android.ugc.aweme.comment.preload;

import X.C16970lZ;
import X.C176826wo;
import X.EE4;
import X.InterfaceC36076EDw;
import android.content.Context;
import com.ss.android.ugc.aweme.task.ExtendedPreloadTask;

/* loaded from: classes4.dex */
public final class CommentPreloadTask extends ExtendedPreloadTask implements InterfaceC36076EDw {
    public final Context LJLJI;

    @Override // com.ss.android.ugc.aweme.task.ExtendedPreloadTask
    public final String LIZLLL() {
        return "click_comment_button_label";
    }

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "CommentPreloadTask";
    }

    @Override // X.InterfaceC36076EDw
    public final int priority() {
        return 2;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final boolean meetTrigger() {
        boolean z;
        if ((C176826wo.LIZ() & 16) == 16) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String LJ = LJ();
            if (LJ != null) {
                return LJ.equals("2");
            }
        } else if ((C176826wo.LIZ() & 32) == 32) {
            String LJ2 = LJ();
            if (LJ2 != null && LJ2.equals("2")) {
                return true;
            }
            String LJ3 = LJ();
            if (LJ3 != null && LJ3.equals("1")) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        return EE4.CPU;
    }

    public CommentPreloadTask(Context context) {
        this.LJLJI = context;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (!C16970lZ.LIZIZ(context, "aweme_comment_fragment_comment_page_list")) {
            C16970lZ.LJFF(this.LJLJI, "aweme_comment_fragment_comment_page_list");
        }
        if (!C16970lZ.LIZIZ(context, "aweme_comment_fragment_comment_list")) {
            C16970lZ.LJFF(this.LJLJI, "aweme_comment_fragment_comment_list");
        }
    }
}
