package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hgi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44712Hgi extends AbstractC45048Hm8 {
    public final /* synthetic */ AutoCutModel LJJI;
    public final /* synthetic */ VideoPublishEditModel LJJIFFI;
    public final /* synthetic */ boolean LJJII;
    public final /* synthetic */ AVMusic LJJIII;
    public final /* synthetic */ InterfaceC44718Hgo LJJIIJ;
    public final /* synthetic */ Context LJJIIJZLJL;
    public final /* synthetic */ InterfaceC145495nN LJJIIZ;
    public final /* synthetic */ InterfaceC44717Hgn LJJIIZI;
    public final /* synthetic */ C5XM LJJIJ;
    public final /* synthetic */ InterfaceC153275zv LJJIJIIJI;
    public final /* synthetic */ C82622Wbi LJJIJIIJIL;
    public final /* synthetic */ InterfaceC143655kP LJJIJIL;
    public final /* synthetic */ C44704Hga LJJIJL;
    public final /* synthetic */ C5LI LJJIJLIJ;

    @Override // X.InterfaceC45222How
    public final void onExit() {
        C6QQ.LIZ(new AqS157S0100000_7(this.LJJIJIIJIL, 181));
    }

    @Override // X.AbstractC45048Hm8, X.InterfaceC45222How
    public final void onCancel() {
        C156906Du c156906Du;
        InterfaceC145495nN interfaceC145495nN;
        super.onCancel();
        if (C44701HgX.LJIIJJI(this.LJJIFFI.creativeModel)) {
            this.LJJIFFI.creativeModel.autoCutModel.clickFrom = null;
            C5LI c5li = this.LJJIJLIJ;
            if (c5li != null) {
                c5li.ms(true);
            }
            if (H7R.LJJIL(this.LJJIFFI) && (interfaceC145495nN = this.LJJIIZ) != null) {
                interfaceC145495nN.u3();
            }
        }
        if (!this.LJJIFFI.isCurrentAutoCutMode()) {
            this.LJJI.clickFrom = null;
        }
        this.LJJI.backwardAutoCutProcess = false;
        if (C44720Hgq.LIZ() && !this.LJJIFFI.getEditorProModel().getFromEditorProAnchor() && !this.LJJIFFI.getEditorProModel().getFromEditorProEntranceInAlbum() && (c156906Du = (C156906Du) this.LJJIJIIJIL.LJIIIIZZ(null, C156906Du.class)) != null) {
            c156906Du.LJFF(this.LJJIFFI);
        }
    }

    @Override // X.AbstractC45048Hm8, X.InterfaceC45209Hoj
    public final void LIZ(NLEModel nLEModel) {
        super.LIZ(nLEModel);
        LJIJJLI("AutoCutEditHelper", this.LJJI);
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIIJJI(List<AutoCutMediaModel> list) {
        List<AutoCutMediaModel> list2 = this.LJJI.mediaList;
        list2.clear();
        list2.addAll(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0096, code lost:
    
        if (r2 != null) goto L36;
     */
    @Override // X.AbstractC45048Hm8, X.InterfaceC45209Hoj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(X.C44716Hgm r16) {
        /*
            r15 = this;
            r5 = r16
            super.LJIIZILJ(r5)
            com.ss.android.ugc.aweme.creative.model.AutoCutModel r1 = r15.LJJI
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = r5.LJII
            java.lang.Long r0 = X.C36942Eeg.LIZIZ(r0)
            r1.optimizeLargeNLEId = r0
            java.lang.String r1 = "AutoCutEditHelper"
            com.ss.android.ugc.aweme.creative.model.AutoCutModel r0 = r15.LJJI
            r15.LJIJJ(r1, r0)
            int r2 = r5.LIZIZ
            X.63A r1 = r5.LIZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r15.LJJIFFI
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.AutoCutModel r0 = r0.autoCutModel
            com.ss.android.ugc.aweme.creative.model.AutoCutThemeData r2 = X.C45087Hml.LJIJJLI(r2, r1, r0)
            r1 = 0
            if (r2 == 0) goto L33
            java.lang.String r0 = r2.templateData
            if (r0 == 0) goto L31
            int r0 = r0.length()
            if (r0 != 0) goto L96
        L31:
            if (r2 != 0) goto L99
        L33:
            r5.LJIIIZ = r1
            boolean r0 = r15.LJJII
            if (r0 == 0) goto L66
            com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = r15.LJJIII
            if (r0 == 0) goto L4c
            com.ss.android.ugc.aweme.creative.model.AutoCutModel r1 = r15.LJJI
            boolean r0 = r0.isPgc()
            if (r0 == 0) goto L93
            java.lang.String r0 = "pgc"
        L47:
            r1.getClass()
            r1.reuseMusicType = r0
        L4c:
            int r0 = r5.LIZIZ
            if (r0 != 0) goto L66
            X.63A r1 = r5.LIZ
            X.63A r0 = X.C63A.AUTO_CUT
            if (r1 != r0) goto L66
            com.ss.android.ugc.aweme.creative.model.AutoCutModel r0 = r15.LJJI
            com.ss.android.ugc.aweme.creative.model.AutoCutThemeData r1 = X.AnonymousClass636.LJII(r0)
            if (r1 != 0) goto L8e
        L5e:
            com.ss.android.ugc.aweme.creative.model.AutoCutModel r0 = r15.LJJI
            com.ss.android.ugc.aweme.creative.model.AutoCutThemeData r1 = X.AnonymousClass636.LJII(r0)
            if (r1 != 0) goto L89
        L66:
            X.Hgk r0 = new X.Hgk
            X.Hgo r1 = r15.LJJIIJ
            android.content.Context r2 = r15.LJJIIJZLJL
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r15.LJJIFFI
            boolean r4 = r15.LJJII
            com.ss.android.ugc.aweme.shortvideo.AVMusic r6 = r15.LJJIII
            X.5nN r7 = r15.LJJIIZ
            X.Hgn r8 = r15.LJJIIZI
            com.ss.android.ugc.aweme.creative.model.AutoCutModel r9 = r15.LJJI
            X.5XM r10 = r15.LJJIJ
            X.5zv r11 = r15.LJJIJIIJI
            X.Wbi r12 = r15.LJJIJIIJIL
            X.5kP r13 = r15.LJJIJIL
            X.Hga r14 = r15.LJJIJL
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.C6QQ.LIZ(r0)
            return
        L89:
            java.lang.String r0 = r5.LJIIJJI
            r1.templateGroupId = r0
            goto L66
        L8e:
            int r0 = r5.LIZJ
            r1.templateType = r0
            goto L5e
        L93:
            java.lang.String r0 = "ugc"
            goto L47
        L96:
            if (r2 == 0) goto L33
            goto La3
        L99:
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = r5.LJII
            if (r0 == 0) goto La1
            java.lang.String r1 = r0.toString()
        La1:
            r2.templateData = r1
        La3:
            java.lang.String r1 = r2.templateId
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44712Hgi.LJIIZILJ(X.Hgm):void");
    }

    @Override // X.AbstractC45048Hm8, X.InterfaceC45209Hoj
    public final void LJIJ(int i) {
        super.LJIJ(i);
        this.LJJI.asyncRenderModel.asyncRenderNecessaryDownloadCount = i;
    }

    @Override // X.AbstractC45048Hm8, X.InterfaceC45209Hoj
    public final void LJIILJJIL(String taskId, List templateList) {
        o.LJIIIZ(templateList, "templateList");
        o.LJIIIZ(taskId, "taskId");
        super.LJIILJJIL(taskId, templateList);
        AutoCutModel autoCutModel = this.LJJI;
        List<AutoCutThemeData> LLJILJILJ = ORZ.LLJILJILJ(templateList);
        autoCutModel.getClass();
        autoCutModel.templateList = LLJILJILJ;
        this.LJJI.taskId = taskId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44712Hgi(AutoCutModel autoCutModel, VideoPublishEditModel videoPublishEditModel, boolean z, AVMusic aVMusic, InterfaceC44718Hgo interfaceC44718Hgo, Context context, InterfaceC145495nN interfaceC145495nN, InterfaceC44717Hgn interfaceC44717Hgn, C5XM c5xm, InterfaceC153275zv interfaceC153275zv, C82622Wbi c82622Wbi, InterfaceC143655kP interfaceC143655kP, C44704Hga c44704Hga, C5LI c5li, String str, String str2, List<AutoCutMediaModel> list, String str3, int i) {
        super("video_edit_page", str, str2, list, str3, i, autoCutModel);
        this.LJJI = autoCutModel;
        this.LJJIFFI = videoPublishEditModel;
        this.LJJII = z;
        this.LJJIII = aVMusic;
        this.LJJIIJ = interfaceC44718Hgo;
        this.LJJIIJZLJL = context;
        this.LJJIIZ = interfaceC145495nN;
        this.LJJIIZI = interfaceC44717Hgn;
        this.LJJIJ = c5xm;
        this.LJJIJIIJI = interfaceC153275zv;
        this.LJJIJIIJIL = c82622Wbi;
        this.LJJIJIL = interfaceC143655kP;
        this.LJJIJL = c44704Hga;
        this.LJJIJLIJ = c5li;
    }
}
