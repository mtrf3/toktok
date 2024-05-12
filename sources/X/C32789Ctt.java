package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import java.io.Serializable;

/* renamed from: X.Ctt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C32789Ctt implements COG, BOB, N9A {
    public final /* synthetic */ Object LJLIL;

    public /* synthetic */ C32789Ctt(Object obj) {
        this.LJLIL = obj;
    }

    @Override // X.N9A
    public final void LIZIZ(MusicCollectionItem musicCollectionItem) {
        XX7 xx7 = (XX7) this.LJLIL;
        xx7.getClass();
        Intent intent = new Intent(xx7.LJLIL.getContext(), (Class<?>) MusicDetailListActivity.class);
        intent.putExtra("music_type", 2);
        intent.putExtra("music_class_id", musicCollectionItem.mcId);
        intent.putExtra("music_class_name", musicCollectionItem.mcName);
        intent.putExtra("music_category_is_hot", musicCollectionItem.isHot);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", xx7.LJLLJ);
        intent.putExtra("music_class_enter_method", "click_category_list");
        intent.putExtra("music_class_level", musicCollectionItem.level);
        intent.putExtra("sound_page_scene", xx7.LJLLL);
        intent.putExtra("max_video_duration", (Serializable) xx7.LJLJJI.first);
        intent.putExtra("shoot_video_length", (Serializable) xx7.LJLJJI.second);
        intent.putExtra("playlist_order_in_csp", musicCollectionItem.playlistOrder);
        intent.putExtra("music_discovery_type", 3);
        ActivityC45651qj mo49getActivity = xx7.LJLIL.mo49getActivity();
        if (mo49getActivity != null) {
            C16880lQ.LJI(mo49getActivity, intent, 10086);
        }
        XVF.LJIIIZ(musicCollectionItem.mcName, "click_category_list", 1, null, "", "change_music_page", musicCollectionItem.mcId);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0289  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.Boolean r38, java.lang.Long r39, int r40, java.lang.String r41) {
        /*
            Method dump skipped, instructions count: 1358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32789Ctt.LIZ(java.lang.Boolean, java.lang.Long, int, java.lang.String):void");
    }
}
