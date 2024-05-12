package com.ss.android.ugc.aweme.detail.platform;

import X.C188727au;
import X.C50420Jqa;
import X.FMX;
import X.InterfaceC55062LjG;
import X.QD3;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.publish.PublishPreviewInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PublishPreviewDetailComponent extends DetailPageComponent {
    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.KU4, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public final void setUserVisibleHint(boolean z) {
    }

    public PublishPreviewDetailComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final void Jk() {
        String str;
        String str2;
        Integer num;
        Integer num2;
        InterfaceC55062LjG adapter;
        PublishPreviewInfo previewData;
        PublishPreviewInfo previewData2;
        PublishPreviewInfo previewData3;
        super.Jk();
        C188727au c188727au = new C188727au();
        Aweme aweme = this.LLFZ;
        String str3 = null;
        if (aweme != null && (previewData3 = aweme.getPreviewData()) != null) {
            str = previewData3.getCreationId();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("creation_id", str);
        Aweme aweme2 = this.LLFZ;
        if (aweme2 != null && (previewData2 = aweme2.getPreviewData()) != null) {
            str2 = previewData2.getContentSource();
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("content_source", str2);
        Aweme aweme3 = this.LLFZ;
        if (aweme3 != null && (previewData = aweme3.getPreviewData()) != null) {
            num = Integer.valueOf(previewData.getProgress());
        } else {
            num = null;
        }
        c188727au.LJFF(num, "publishing_percentage");
        DetailFragmentPanel detailFragmentPanel = this.LJZL;
        if (detailFragmentPanel != null && (adapter = detailFragmentPanel.getAdapter()) != null) {
            num2 = Integer.valueOf(adapter.getCount());
        } else {
            num2 = null;
        }
        c188727au.LJFF(num2, "publish_cnt");
        Aweme aweme4 = this.LLFZ;
        if (aweme4 != null) {
            str3 = aweme4.getGroupId();
        }
        c188727au.LJIIIZ("group_id", str3);
        FMX.LJIIL("click_leave_publishing_preview_page", c188727au.LIZ);
    }

    @QD3
    public final void onVideoEvent(C50420Jqa c50420Jqa) {
        InterfaceC55062LjG adapter;
        InterfaceC55062LjG adapter2;
        List<Aweme> Q8;
        InterfaceC55062LjG adapter3;
        InterfaceC55062LjG adapter4;
        List<Aweme> Q82;
        if (c50420Jqa != null && c50420Jqa.LJLIL == 2) {
            Object obj = c50420Jqa.LJLILLLLZI;
            Aweme aweme = null;
            if (!(obj instanceof String)) {
                obj = null;
            }
            DetailFragmentPanel detailFragmentPanel = this.LJZL;
            if (detailFragmentPanel != null && (adapter4 = detailFragmentPanel.getAdapter()) != null && (Q82 = adapter4.Q8()) != null) {
                Iterator<Aweme> it = Q82.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Aweme next = it.next();
                    if (o.LJ(next.getAid(), obj)) {
                        aweme = next;
                        break;
                    }
                }
            }
            DetailFragmentPanel detailFragmentPanel2 = this.LJZL;
            if (detailFragmentPanel2 != null && (adapter2 = detailFragmentPanel2.getAdapter()) != null && (Q8 = adapter2.Q8()) != null) {
                int indexOf = Q8.indexOf(aweme);
                DetailFragmentPanel detailFragmentPanel3 = this.LJZL;
                if (detailFragmentPanel3 != null && (adapter3 = detailFragmentPanel3.getAdapter()) != null) {
                    adapter3.LJ(indexOf);
                }
            }
            DetailFragmentPanel detailFragmentPanel4 = this.LJZL;
            if (detailFragmentPanel4 != null && (adapter = detailFragmentPanel4.getAdapter()) != null && adapter.getCount() == 0) {
                Jk();
            }
        }
    }
}
