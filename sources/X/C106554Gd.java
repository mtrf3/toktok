package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4Gd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106554Gd {
    public final E9X<String, C106564Ge> LIZIZ = new E9X<>(5);
    public final String LIZ = EF7.LIZIZ().getString(R.string.g2i);

    public static void LIZ(C106564Ge c106564Ge, final List list, final C106574Gf c106574Gf, final C59678NbW c59678NbW, final int i) {
        C106524Ga c106524Ga = c106564Ge.LIZLLL;
        ((ArrayList) c106524Ga.LJLIL).clear();
        ((ArrayList) c106524Ga.LJLIL).addAll(list);
        c106564Ge.LIZLLL.notifyDataSetChanged();
        c106564Ge.LIZJ.setOnItemClickListener(new AdapterView.OnItemClickListener(list, c106574Gf, c59678NbW, i) { // from class: X.4Ch
            public final /* synthetic */ List LJLIL;
            public final /* synthetic */ C3UR LJLILLLLZI;
            public final /* synthetic */ C59678NbW LJLJI;

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                String previewEmoji;
                List list2 = this.LJLIL;
                C3UR c3ur = this.LJLILLLLZI;
                C59678NbW emojiPanelModel = this.LJLJI;
                C105454Bx c105454Bx = (C105454Bx) ListProtector.get(list2, i2);
                if (c105454Bx == null) {
                    return;
                }
                if (c105454Bx.LIZ == R.drawable.asl) {
                    c3ur.LIZIZ();
                    return;
                }
                if (c105454Bx.LIZ()) {
                    CommentPersonalizedEmoji commentPersonalizedEmoji = c105454Bx.LJI;
                    if (commentPersonalizedEmoji != null) {
                        c3ur.j2(commentPersonalizedEmoji);
                        return;
                    }
                    Emoji emoji = c105454Bx.LIZJ;
                    if (emoji instanceof ImSysEmojiModel) {
                        ImSysEmojiModel imSysEmojiModel = (ImSysEmojiModel) emoji;
                        if (imSysEmojiModel.getPreviewEmoji() == null) {
                            previewEmoji = "";
                        } else {
                            previewEmoji = imSysEmojiModel.getPreviewEmoji();
                        }
                        c3ur.LIZLLL(previewEmoji);
                        return;
                    }
                    View findViewById = view.findViewById(R.id.cud);
                    o.LJIIIZ(emojiPanelModel, "emojiPanelModel");
                    c3ur.LIZ(findViewById, c105454Bx);
                    return;
                }
                if (TextUtils.isEmpty(c105454Bx.LIZIZ)) {
                    return;
                }
                c3ur.LIZLLL(c105454Bx.LIZIZ);
            }
        });
    }
}
