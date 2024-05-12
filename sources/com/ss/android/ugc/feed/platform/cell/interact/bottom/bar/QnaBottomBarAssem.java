package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C61878OQg;
import X.C78999UzT;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class QnaBottomBarAssem extends BaseCellSlotComponent<QnaBottomBarAssem> {
    public ViewGroup LLFII;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ae8;
    }

    public QnaBottomBarAssem() {
        new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.aweme.services.IQnaService] */
    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        FrameLayout frameLayout;
        ?? r3;
        QaStruct qaStruct;
        Long valueOf;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        ViewGroup viewGroup = this.LLFII;
        if (viewGroup instanceof FrameLayout) {
            frameLayout = (FrameLayout) viewGroup;
        } else {
            frameLayout = null;
        }
        int i = 0;
        if (frameLayout != null) {
            ?? LIZ = QnaService.LIZ();
            Aweme aweme = item.getAweme();
            o.LJIIIIZZ(aweme, "item.aweme");
            List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
            if (interactStickerStructs == null || interactStickerStructs.isEmpty()) {
                r3 = C61878OQg.INSTANCE;
            } else {
                List<InteractStickerStruct> interactStickerStructs2 = aweme.getInteractStickerStructs();
                if (interactStickerStructs2 != null) {
                    r3 = new ArrayList();
                    for (InteractStickerStruct interactStickerStruct : interactStickerStructs2) {
                        if (interactStickerStruct != null && (qaStruct = interactStickerStruct.getQaStruct()) != null && (valueOf = Long.valueOf(qaStruct.getQuestionId())) != null) {
                            r3.add(valueOf);
                        }
                    }
                } else {
                    r3 = C61878OQg.INSTANCE;
                }
            }
            LIZ.injectQnaBanner(frameLayout, r3);
        }
        ViewGroup viewGroup2 = this.LLFII;
        if (viewGroup2 == null) {
            return;
        }
        if (!C78999UzT.LJIIZILJ(item)) {
            i = 8;
        }
        viewGroup2.setVisibility(i);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFII = (ViewGroup) view.findViewById(R.id.aqo);
    }
}
