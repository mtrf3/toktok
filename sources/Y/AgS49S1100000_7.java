package Y;

import X.C10I;
import X.C10K;
import X.C188727au;
import X.C43994HOk;
import X.C68322mC;
import X.C76800UCe;
import X.C78939UyV;
import X.FMX;
import X.H7B;
import X.HTF;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.api.AnchorAutoSelectionResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.aweme.detail.panel.DuetDiscoverPanel;
import com.ss.android.ugc.aweme.detail.panel.DuetModeCameraServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS16S0200000_7;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.web.jsbridge.ShareOpenPlatformMethod;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AgS49S1100000_7 implements C10I {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS49S1100000_7 agS49S1100000_7, C10K task) {
        DuetDiscoverPanel duetDiscoverPanel;
        Activity activity;
        o.LJIIIZ(task, "task");
        if (!task.LJIILJJIL() && !task.LJIIL() && task.LJIIJJI() != null) {
            Aweme aweme = (Aweme) task.LJIIJJI();
            if (aweme != null && (activity = (duetDiscoverPanel = (DuetDiscoverPanel) agS49S1100000_7.l1).activity) != null) {
                DuetModeCameraServiceImpl.LJ().LIZLLL().LIZ(activity, aweme, duetDiscoverPanel.LLIIJLIL());
                return null;
            }
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("duet mode query origin awemeId error ");
        LIZ.append(agS49S1100000_7.s0);
        H7B.LIZJ(X1D.LIZIZ(LIZ));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [T, com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder] */
    public static final Object then$1(AgS49S1100000_7 agS49S1100000_7, C10K c10k) {
        List<String> list;
        String str;
        int i;
        boolean z;
        Integer height;
        Integer width;
        AnchorAutoSelectionResponse anchorAutoSelectionResponse = (AnchorAutoSelectionResponse) c10k.LJIIJJI();
        if (anchorAutoSelectionResponse.status == 0) {
            CreateAnchorInfo createAnchorInfo = anchorAutoSelectionResponse.anchor;
            UrlModel urlModel = new UrlModel();
            com.ss.android.ugc.aweme.api.UrlModel urlModel2 = anchorAutoSelectionResponse.addedIcon;
            String str2 = null;
            if (urlModel2 != null) {
                list = urlModel2.getUrlList();
            } else {
                list = null;
            }
            urlModel.setUrlList(list);
            com.ss.android.ugc.aweme.api.UrlModel urlModel3 = anchorAutoSelectionResponse.addedIcon;
            if (urlModel3 != null) {
                str = urlModel3.getUri();
            } else {
                str = null;
            }
            urlModel.setUri(str);
            com.ss.android.ugc.aweme.api.UrlModel urlModel4 = anchorAutoSelectionResponse.addedIcon;
            int i2 = 0;
            if (urlModel4 != null && (width = urlModel4.getWidth()) != null) {
                i = width.intValue();
            } else {
                i = 0;
            }
            urlModel.setWidth(i);
            com.ss.android.ugc.aweme.api.UrlModel urlModel5 = anchorAutoSelectionResponse.addedIcon;
            if (urlModel5 != null && (height = urlModel5.getHeight()) != null) {
                i2 = height.intValue();
            }
            urlModel.setHeight(i2);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("shoot_way", "jsb");
            c188727au.LJIIIZ("enter_from", "video_edit_page");
            c188727au.LJIIIZ("anchor_type", "game");
            if (createAnchorInfo != null) {
                str2 = createAnchorInfo.getKeyword();
            }
            c188727au.LJIIIZ("anchor_entry", str2);
            FMX.LJIIL("choose_anchor", c188727au.LIZ);
            long currentTimeMillis = System.currentTimeMillis();
            H7B.LJ("click to open camera");
            C43994HOk.LIZ = System.currentTimeMillis();
            C68322mC c68322mC = new C68322mC();
            ?? builder = new RecordConfig.Builder();
            builder.creationId(UUID.randomUUID().toString());
            builder.shootWay("direct_shoot");
            builder.groupId(C78939UyV.LJLILLLLZI);
            builder.fromMain(true);
            builder.startRecordTime(currentTimeMillis);
            builder.musicType(1);
            builder.translationType(HTF.LIZ());
            builder.enterFrom(((ShareOpenPlatformMethod) agS49S1100000_7.l1).LJLJI);
            builder.enterMethod(((ShareOpenPlatformMethod) agS49S1100000_7.l1).LJLJJI);
            c68322mC.element = builder;
            if (createAnchorInfo != null) {
                String str3 = agS49S1100000_7.s0;
                ShareOpenPlatformMethod shareOpenPlatformMethod = (ShareOpenPlatformMethod) agS49S1100000_7.l1;
                int type = createAnchorInfo.getType();
                String content = createAnchorInfo.getContent();
                String keyword = createAnchorInfo.getKeyword();
                String url = createAnchorInfo.getUrl();
                String extra = createAnchorInfo.getExtra();
                Boolean bool = anchorAutoSelectionResponse.canRemove;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = true;
                }
                AnchorTransData anchorTransData = new AnchorTransData(type, content, keyword, null, 4, null, urlModel, z, url, null, null, extra, null, false, 13864, null);
                ?? r5 = (RecordConfig.Builder) c68322mC.element;
                r5.setAutoSelectedAnchor(anchorTransData);
                r5.setOpenPlatformExtra(str3);
                r5.setOpenPlatformClientKey(shareOpenPlatformMethod.LJLJJL);
                c68322mC.element = r5;
            }
            IExternalService LIZ = AVExternalServiceImpl.LIZ();
            Context actContext = ((ShareOpenPlatformMethod) agS49S1100000_7.l1).getActContext();
            o.LJIIIIZZ(actContext, "actContext");
            LIZ.asyncServiceForMainRecordService(actContext, "direct_shoot", new IDLCallbackS16S0200000_7((ShareOpenPlatformMethod) agS49S1100000_7.l1, c68322mC, 7));
        }
        return C76800UCe.LIZ;
    }

    public AgS49S1100000_7(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
