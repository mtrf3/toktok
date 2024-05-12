package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hgj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44713Hgj extends AbstractC45048Hm8 {
    public final /* synthetic */ AutoCutModel LJJI;
    public final /* synthetic */ VideoPublishEditModel LJJIFFI;
    public final /* synthetic */ InterfaceC44718Hgo LJJII;
    public final /* synthetic */ Context LJJIII;
    public final /* synthetic */ InterfaceC143655kP LJJIIJ;
    public final /* synthetic */ C44716Hgm LJJIIJZLJL;
    public final /* synthetic */ C44722Hgs LJJIIZ;
    public final /* synthetic */ InterfaceC44717Hgn LJJIIZI;
    public final /* synthetic */ C44704Hga LJJIJ;

    @Override // X.InterfaceC45222How
    public final void onExit() {
        C6QQ.LIZ(new AqS157S0100000_7(this.LJJIIJ, 182));
    }

    @Override // X.AbstractC45048Hm8, X.InterfaceC45222How
    public final void onCancel() {
        super.onCancel();
        if (!this.LJJIFFI.isCurrentAutoCutMode()) {
            this.LJJI.clickFrom = null;
        }
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIIJJI(List<AutoCutMediaModel> list) {
        List<AutoCutMediaModel> list2 = this.LJJI.mediaList;
        list2.clear();
        list2.addAll(list);
    }

    @Override // X.AbstractC45048Hm8, X.InterfaceC45209Hoj
    public final void LJIIZILJ(C44716Hgm c44716Hgm) {
        String str;
        super.LJIIZILJ(c44716Hgm);
        this.LJJI.optimizeLargeNLEId = C36942Eeg.LIZIZ(c44716Hgm.LJII);
        AutoCutThemeData LJIJJLI = C45087Hml.LJIJJLI(c44716Hgm.LIZIZ, c44716Hgm.LIZ, this.LJJIFFI.creativeModel.autoCutModel);
        String str2 = null;
        if (LJIJJLI != null && (((str = LJIJJLI.templateData) == null || str.length() == 0) && LJIJJLI != null)) {
            NLEModel nLEModel = c44716Hgm.LJII;
            if (nLEModel != null) {
                str2 = nLEModel.toString();
            }
            LJIJJLI.templateData = str2;
        }
        C6QQ.LIZ(new C44715Hgl(this.LJJII, this.LJJIII, this.LJJIIJ, this.LJJIIJZLJL, this.LJJIIZ, this.LJJI, c44716Hgm, this.LJJIIZI, this.LJJIFFI, this.LJJIJ));
    }

    @Override // X.AbstractC45048Hm8, X.InterfaceC45209Hoj
    public final void LJIILJJIL(String taskId, List templateList) {
        C63A c63a;
        o.LJIIIZ(templateList, "templateList");
        o.LJIIIZ(taskId, "taskId");
        super.LJIILJJIL(taskId, templateList);
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) ORZ.LJLLLL(this.LJJI.templateList);
        AutoCutModel autoCutModel = this.LJJI;
        ArrayList LJ = C61328O5c.LJ(templateList);
        if (autoCutThemeData != null) {
            c63a = autoCutThemeData.LIZ();
        } else {
            c63a = null;
        }
        if (c63a == C63A.SOUND_SYNC) {
            ORS.LJJLIL(C44719Hgp.LJLIL, LJ);
            ListProtector.add(LJ, 0, autoCutThemeData);
        }
        autoCutModel.getClass();
        autoCutModel.templateList = LJ;
        this.LJJI.taskId = taskId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44713Hgj(AutoCutModel autoCutModel, VideoPublishEditModel videoPublishEditModel, InterfaceC44718Hgo interfaceC44718Hgo, Context context, InterfaceC143655kP interfaceC143655kP, C44716Hgm c44716Hgm, C44722Hgs c44722Hgs, InterfaceC44717Hgn interfaceC44717Hgn, C44704Hga c44704Hga, String str, String str2, List<AutoCutMediaModel> list, int i) {
        super("video_edit_page", str, str2, list, "other", i, autoCutModel);
        this.LJJI = autoCutModel;
        this.LJJIFFI = videoPublishEditModel;
        this.LJJII = interfaceC44718Hgo;
        this.LJJIII = context;
        this.LJJIIJ = interfaceC143655kP;
        this.LJJIIJZLJL = c44716Hgm;
        this.LJJIIZ = c44722Hgs;
        this.LJJIIZI = interfaceC44717Hgn;
        this.LJJIJ = c44704Hga;
    }
}
