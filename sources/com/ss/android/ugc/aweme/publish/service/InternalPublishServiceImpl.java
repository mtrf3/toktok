package com.ss.android.ugc.aweme.publish.service;

import X.AbstractC41507GQt;
import X.AbstractC42651GoZ;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C00F;
import X.C133765Mu;
import X.C162256Yj;
import X.C163426bC;
import X.C169696lJ;
import X.C221108m2;
import X.C32I;
import X.C40968G6a;
import X.C40982G6o;
import X.C41002G7i;
import X.C41005G7l;
import X.C41020G8a;
import X.C41021G8b;
import X.C41023G8d;
import X.C41315GJj;
import X.C41488GQa;
import X.C41495GQh;
import X.C41571GTf;
import X.C41573GTh;
import X.C41574GTi;
import X.C41575GTj;
import X.C41576GTk;
import X.C41577GTl;
import X.C41578GTm;
import X.C41579GTn;
import X.C41580GTo;
import X.C41581GTp;
import X.C41582GTq;
import X.C41583GTr;
import X.C41584GTs;
import X.C41585GTt;
import X.C41586GTu;
import X.C41587GTv;
import X.C41589GTx;
import X.C41590GTy;
import X.C41591GTz;
import X.C41610GUs;
import X.C41637GVt;
import X.C41658GWo;
import X.C41775GaR;
import X.C41859Gbn;
import X.C41958GdO;
import X.C43518H6c;
import X.C43722HDy;
import X.C44172HVg;
import X.C44384HbQ;
import X.C45828Hyi;
import X.C47261Igj;
import X.C5V5;
import X.C60903NvH;
import X.C62822Ol8;
import X.C73030SlO;
import X.C73969T1h;
import X.C76800UCe;
import X.C78934UyQ;
import X.C78996UzQ;
import X.G8P;
import X.G8X;
import X.G9G;
import X.GA9;
import X.GI2;
import X.GI3;
import X.GLI;
import X.GMZ;
import X.GQ3;
import X.GQU;
import X.GSL;
import X.GTY;
import X.GU0;
import X.GU1;
import X.GU2;
import X.GU7;
import X.GU9;
import X.GUE;
import X.GUF;
import X.GUH;
import X.GUI;
import X.GUT;
import X.GUU;
import X.GUW;
import X.GW9;
import X.H0W;
import X.H6J;
import X.H78;
import X.H8E;
import X.HE2;
import X.HIS;
import X.HVR;
import X.InterfaceC116954iR;
import X.InterfaceC153045zY;
import X.InterfaceC163006aW;
import X.InterfaceC88471Ynr;
import X.J30;
import X.ORS;
import X.ORV;
import X.OSZ;
import X.T16;
import X.WM7;
import X.X1D;
import Y.AObserverS75S0100000_7;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.ss.android.ugc.aweme.adaptation.PublishPreviewScene;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.gamora.editorpro.guide.EditorProGuideTargetUserApi;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class InternalPublishServiceImpl implements InterfaceC163006aW {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C41586GTu.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C41583GTr.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C41579GTn.LJLIL);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(GU0.LJLIL);
    public final C62822Ol8 LJ = C221108m2.LIZIZ(C41587GTv.LJLIL);
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(C41590GTy.LJLIL);
    public final C62822Ol8 LJI = C221108m2.LIZIZ(C41584GTs.LJLIL);
    public final C62822Ol8 LJII = C221108m2.LIZIZ(C41585GTt.LJLIL);
    public final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(C41578GTm.LJLIL);
    public final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(C41577GTl.LJLIL);
    public final C62822Ol8 LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public final C62822Ol8 LJIIL;
    public final C62822Ol8 LJIILIIL;
    public final C62822Ol8 LJIILJJIL;
    public final C62822Ol8 LJIILL;
    public final C62822Ol8 LJIILLIIL;

    @Override // X.InterfaceC163006aW
    public final void LIZ() {
        synchronized (GUH.class) {
            GUI gui = GUH.LIZJ;
            if (gui.LJIIIZ()) {
                if (C41637GVt.LIZ()) {
                    H78.LJI("PublishScheduler continue markRecord");
                    gui.LIZJ(GUE.LJLIL);
                }
            }
        }
    }

    @Override // X.InterfaceC163006aW
    public final boolean LIZIZ() {
        J30 j30 = (J30) H6J.LIZLLL.getValue();
        if (j30 != null) {
            return j30.LIZLLL();
        }
        return false;
    }

    @Override // X.InterfaceC163006aW
    public final C41610GUs LIZJ() {
        return (C41610GUs) this.LJIIJJI.getValue();
    }

    @Override // X.InterfaceC163006aW
    public final C162256Yj LJFF() {
        return (C162256Yj) this.LJIILLIIL.getValue();
    }

    @Override // X.InterfaceC163006aW
    public final GUT LJI() {
        return (GUT) this.LIZLLL.getValue();
    }

    @Override // X.InterfaceC163006aW
    public final GMZ LJIIIIZZ() {
        return (GMZ) this.LJIILL.getValue();
    }

    @Override // X.InterfaceC163006aW
    public final List<String> LJIIIZ() {
        ArrayList arrayList;
        GUI gui = GUH.LIZJ;
        synchronized (gui) {
            arrayList = new ArrayList();
            List<GUU> mPublishRecordList = gui.LIZ;
            o.LJIIIIZZ(mPublishRecordList, "mPublishRecordList");
            Iterator<GUU> it = mPublishRecordList.iterator();
            while (it.hasNext()) {
                String draftPrimaryKey = it.next().LIZ.editModel.getDraftPrimaryKey();
                if (draftPrimaryKey == null) {
                    draftPrimaryKey = "";
                }
                arrayList.add(draftPrimaryKey);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC163006aW
    public final G8X LJIIJ() {
        return (G8X) this.LJIIIZ.getValue();
    }

    @Override // X.InterfaceC163006aW
    public final C43518H6c LJIIJJI() {
        return (C43518H6c) this.LIZ.getValue();
    }

    @Override // X.InterfaceC163006aW
    public final C41958GdO LJIILIIL() {
        return (C41958GdO) this.LJII.getValue();
    }

    @Override // X.InterfaceC163006aW
    public final C41488GQa LJIILLIIL() {
        return (C41488GQa) this.LJIILJJIL.getValue();
    }

    @Override // X.InterfaceC163006aW
    public final GSL LJIJI() {
        return (GSL) this.LJIIIIZZ.getValue();
    }

    @Override // X.InterfaceC163006aW
    public final GQ3 LJIJJLI() {
        return (GQ3) this.LJIILIIL.getValue();
    }

    @Override // X.InterfaceC163006aW
    public final HIS LJIL() {
        return (HIS) this.LJIIJ.getValue();
    }

    @Override // X.InterfaceC163006aW
    public final C41859Gbn LJJ() {
        return (C41859Gbn) this.LJI.getValue();
    }

    @Override // X.InterfaceC163006aW
    public final C41775GaR LJJIIJ() {
        return (C41775GaR) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC163006aW
    public final G9G LJJIIZI() {
        return (G9G) this.LJIIL.getValue();
    }

    @Override // X.InterfaceC163006aW
    public final GU1 LJJIJ() {
        return (GU1) this.LJ.getValue();
    }

    @Override // X.InterfaceC163006aW
    public final H0W LJJIJIIJI() {
        return (H0W) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC163006aW
    public final C163426bC LJJIL() {
        return (C163426bC) this.LJFF.getValue();
    }

    public InternalPublishServiceImpl() {
        C221108m2.LIZIZ(GU2.LJLIL);
        this.LJIIJ = C221108m2.LIZIZ(C41582GTq.LJLIL);
        this.LJIIJJI = C221108m2.LIZIZ(C41589GTx.LJLIL);
        this.LJIIL = C221108m2.LIZIZ(C41580GTo.LJLIL);
        this.LJIILIIL = C221108m2.LIZIZ(C41575GTj.LJLIL);
        this.LJIILJJIL = C221108m2.LIZIZ(C41576GTk.LJLIL);
        this.LJIILL = C221108m2.LIZIZ(C41581GTp.LJLIL);
        this.LJIILLIIL = C221108m2.LIZIZ(C41591GTz.LJLIL);
    }

    @Override // X.InterfaceC163006aW
    public final int LJIIL() {
        return GUH.LJIIZILJ();
    }

    @Override // X.InterfaceC163006aW
    public final void LJIIZILJ() {
        ((EditorProGuideTargetUserApi.Api) C169696lJ.LIZ(C60903NvH.LJIIJJI().getNetworkService(), true, EditorProGuideTargetUserApi.Api.class)).requestIsEpGuideTargetUser(false, true).LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LIZ(new InterfaceC116954iR<EditorProGuideTargetUserApi.FetchIsEpGuideTargetUserResponse>() { // from class: X.6Zp
            @Override // X.InterfaceC116954iR
            public final void onComplete() {
            }

            @Override // X.InterfaceC116954iR
            public final void onSubscribe(InterfaceC92693kP d) {
                o.LJIIIZ(d, "d");
            }

            @Override // X.InterfaceC116954iR
            public final void onError(Throwable e) {
                o.LJIIIZ(e, "e");
                C162586Zq.LIZ.postValue(Boolean.FALSE);
            }

            @Override // X.InterfaceC116954iR
            public final void onNext(EditorProGuideTargetUserApi.FetchIsEpGuideTargetUserResponse fetchIsEpGuideTargetUserResponse) {
                boolean z;
                EditorProGuideTargetUserApi.FetchIsEpGuideTargetUserResponse t = fetchIsEpGuideTargetUserResponse;
                o.LJIIIZ(t, "t");
                MutableLiveData<Boolean> mutableLiveData = C162586Zq.LIZ;
                Boolean isVideoAddToSeriesAllowed = t.isVideoAddToSeriesAllowed();
                if (isVideoAddToSeriesAllowed != null) {
                    z = isVideoAddToSeriesAllowed.booleanValue();
                } else {
                    z = false;
                }
                mutableLiveData.postValue(Boolean.valueOf(z));
            }
        });
    }

    @Override // X.InterfaceC163006aW
    public final boolean LJJIFFI() {
        if (GUH.LJIIZILJ() > 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC163006aW
    public final void LJJIJL() {
        GUH.LJJIFFI();
    }

    @Override // X.InterfaceC163006aW
    public final void LJII(VideoPublishEditModel model) {
        List<AVTextExtraStruct> structList;
        o.LJIIIZ(model, "model");
        C41495GQh c41495GQh = new C41495GQh(new GQU(C40982G6o.LIZ(), GA9.LIZ()));
        String str = model.title;
        if (str == null || (structList = model.getStructList()) == null) {
            return;
        }
        c41495GQh.LJI(str, structList);
        ORV LIZ = c41495GQh.LIZ();
        PostPageModel postPageModel = model.creativeModel.postPageModel;
        ArrayList arrayList = new ArrayList(C32I.LJJL(LIZ, 10));
        Iterator<E> it = LIZ.iterator();
        int i = 0;
        while (true) {
            Object obj = null;
            if (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList.add(((AbstractC41507GQt) next).LJIILLIIL(str));
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            } else {
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    obj = it2.next();
                    while (it2.hasNext()) {
                        obj = i0.LJFF((String) obj, (String) it2.next());
                    }
                }
                String str2 = (String) obj;
                if (str2 == null) {
                    str2 = "";
                }
                postPageModel.markupCaption = str2;
                PostPageModel postPageModel2 = model.creativeModel.postPageModel;
                ArrayList arrayList2 = new ArrayList();
                Iterator<E> it3 = LIZ.iterator();
                while (it3.hasNext()) {
                    ORS.LJJLIIIJILLIZJL(((AbstractC41507GQt) it3.next()).LJI(), arrayList2);
                }
                postPageModel2.getClass();
                postPageModel2.markupExtra = arrayList2;
                return;
            }
        }
    }

    @Override // X.InterfaceC163006aW
    public final boolean LJIILJJIL(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        return C5V5.LJ(model);
    }

    @Override // X.InterfaceC163006aW
    public final boolean LJJI(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        try {
            OSZ LJJIIJ = g0.LJJIIJ(model);
            if (((Number) LJJIIJ.getFirst()).intValue() + ((Number) LJJIIJ.getSecond()).intValue() <= 1) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // X.InterfaceC163006aW
    public final boolean LJJII(boolean z) {
        if (!z) {
            return C40968G6a.LIZ();
        }
        if (C00F.LIZ(31744, 0, "refactor_publish_check_story", true) == 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC163006aW
    public final boolean LJJIII(VideoPublishEditModel model) {
        boolean z;
        String str;
        boolean z2;
        o.LJIIIZ(model, "model");
        if (GUH.LJIIZILJ() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (ActivityStack.getValidTopActivity() == null) {
            return false;
        }
        String str2 = model.creativeModel.editSaveLocalModel.flowId;
        Boolean value = GU7.LJ.getValue();
        GU9 gu9 = GU7.LIZLLL;
        if (gu9 != null) {
            str = gu9.LIZJ;
        } else {
            str = null;
        }
        boolean LJ = o.LJ(str2, str);
        if (o.LJ(value, Boolean.TRUE) && LJ) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            GU7.LIZIZ(R.string.q9w, 1005);
            GU7.LJ(2, model);
            return false;
        }
        if (z2) {
            GU7.LIZIZ(R.string.q9v, 1006);
            GU7.LJ(1, model);
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC163006aW
    public final void LJJIIJZLJL(String str) {
        synchronized (GUH.class) {
            GUI gui = GUH.LIZJ;
            if (gui.LJIIIZ()) {
                if (GUW.LIZIZ()) {
                    H78.LJI("PublishScheduler force pause");
                    gui.LIZJ(GUF.LJLIL);
                } else if (GUW.LIZ()) {
                    H78.LJI("PublishScheduler force cancel");
                    C41574GTi c41574GTi = new C41574GTi();
                    c41574GTi.LIZ = str;
                    GUH.LJI(c41574GTi.LIZ());
                } else if (C41637GVt.LIZ()) {
                    H78.LJI("PublishScheduler continue");
                }
            }
        }
    }

    @Override // X.InterfaceC163006aW
    public final List<AVTextExtraStruct> LJJIIZ(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.length() != 0) {
            ArrayList LJII = C73030SlO.LJII(str);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = LJII.iterator();
            int i = 0;
            while (it.hasNext()) {
                String s = (String) it.next();
                o.LJIIIIZZ(s, "s");
                int LJJLIIIJL = s.LJJLIIIJL(str, s, i, false, 4);
                if (LJJLIIIJL >= 0) {
                    i = s.length() + LJJLIIIJL;
                    arrayList2.add(new OSZ(Integer.valueOf(LJJLIIIJL), Integer.valueOf(i)));
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                OSZ osz = (OSZ) it2.next();
                AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
                aVTextExtraStruct.type = 1;
                String substring = str.substring(((Number) osz.getFirst()).intValue(), ((Number) osz.getSecond()).intValue());
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                aVTextExtraStruct.hashTagName = ujb.o.LJJJJZ(substring, "#", "", false);
                aVTextExtraStruct.start = ((Number) osz.getFirst()).intValue();
                aVTextExtraStruct.end = ((Number) osz.getSecond()).intValue();
                arrayList.add(aVTextExtraStruct);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC163006aW
    public final int LJJIJLIJ(int i) {
        if (i == 2) {
            return new C41002G7i(false).LIZIZ();
        }
        return new C41005G7l().LIZIZ();
    }

    @Override // X.InterfaceC163006aW
    public final void LJJIJIIJIL(ActivityC45651qj activity, BaseShortVideoContext baseContext) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(baseContext, "baseContext");
        ((HE2) C78934UyQ.LJLIL.getBridgeService()).LIZJ(activity, baseContext, C45828Hyi.LJIILJJIL);
    }

    @Override // X.InterfaceC163006aW
    public final void LJJIJIL(final LifecycleOwner owner, InterfaceC88471Ynr<? super Boolean, ? super String, C76800UCe> interfaceC88471Ynr) {
        o.LJIIIZ(owner, "owner");
        GU7.LJ.observe(owner, new AObserverS75S0100000_7(interfaceC88471Ynr, 15));
        owner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.publish.service.InternalPublishServiceImpl$observeIsSavingLocal$2
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    GU7.LJ.removeObservers(LifecycleOwner.this);
                    LifecycleOwner.this.getLifecycle().removeObserver(this);
                }
            }
        });
    }

    @Override // X.InterfaceC163006aW
    public final void LJJIZ(VideoPublishEditModel editModel, String cancelDetail) {
        o.LJIIIZ(editModel, "editModel");
        o.LJIIIZ(cancelDetail, "cancelDetail");
        C41571GTf.LIZIZ(editModel, cancelDetail);
    }

    @Override // X.InterfaceC163006aW
    public final void LIZLLL(String flowId, InterfaceC153045zY interfaceC153045zY, boolean z) {
        String str;
        C133765Mu c133765Mu;
        boolean z2;
        GU9 gu9;
        o.LJIIIZ(flowId, "flowId");
        GU9 gu92 = GU7.LIZLLL;
        GU9 gu93 = null;
        if (gu92 != null) {
            str = gu92.LIZJ;
        } else {
            str = null;
        }
        if (!o.LJ(str, flowId) || !(interfaceC153045zY instanceof C133765Mu) || (c133765Mu = (C133765Mu) interfaceC153045zY) == null) {
            return;
        }
        if (c133765Mu.LJFF().unorderEquals(gu92.LJFF) && !z && (gu9 = GU7.LIZLLL) != null && !gu9.LJIIIZ) {
            z2 = false;
        } else {
            z2 = true;
        }
        GU9 gu94 = GU7.LIZLLL;
        if (gu94 != null) {
            gu93 = GU9.LIZ(gu94, null, z2, null, false, null, 2039);
        }
        GU7.LIZLLL = gu93;
    }

    @Override // X.InterfaceC163006aW
    public final void LJJJ(InterfaceC153045zY interfaceC153045zY, VideoPublishEditModel model, boolean z) {
        ActivityC45651qj activityC45651qj;
        o.LJIIIZ(model, "model");
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if (!(validTopActivity instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) validTopActivity) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 29) {
            HVR.LJII(activityC45651qj, new C41573GTh(interfaceC153045zY, model, z), new AqS157S0100000_7(model, 680), TokenCert.Companion.with("bpea-tools_request_storage_permission_edit_page_save_local"), 24);
        } else {
            GU7.LJII(model, interfaceC153045zY, z, false, 8);
        }
    }

    @Override // X.InterfaceC163006aW
    public final void LJIILL(VideoPublishEditModel model, ActivityC45651qj activity, Bundle publishBundle, WM7 wm7) {
        PublishPreviewScene publishPreviewScene;
        o.LJIIIZ(model, "model");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(publishBundle, "publishBundle");
        C41315GJj.LIZLLL(model);
        C41658GWo.LIZLLL().LJIIIIZZ(model.getCreationId());
        DraftInfoModel draftInfoModel = model.creativeModel.draftInfoModel;
        draftInfoModel.getClass();
        draftInfoModel.saveDraftScene = "saveDraftBeforePublish";
        H8E h8e = new H8E();
        if (wm7 instanceof PublishPreviewScene) {
            publishPreviewScene = (PublishPreviewScene) wm7;
        } else {
            publishPreviewScene = null;
        }
        H8E.LJIIIIZZ(h8e, activity, model, false, publishPreviewScene, false, null, null, 448);
        GI3.LJII(new G8P(new C41021G8b(model, new GLI("previewScene", 1)), new GI2(publishBundle, activity, model)));
    }

    @Override // X.InterfaceC163006aW
    public final void LJIJ(AbstractC42651GoZ rootScene, Activity activity, VideoPublishEditModel editModel, InterfaceC153045zY interfaceC153045zY) {
        o.LJIIIZ(rootScene, "rootScene");
        o.LJIIIZ(editModel, "editModel");
        synchronized (C41571GTf.class) {
            GU7.LIZJ = null;
            if (!C41571GTf.LIZ) {
                C41571GTf.LJI("ab close");
                return;
            }
            C41571GTf.LJ = true;
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                AbstractC73672Svk.LJJLIIIJLJLI(C41571GTf.LIZIZ, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new GTY(rootScene, activity, editModel, interfaceC153045zY));
                return;
            }
            C41571GTf.LJI("activity invalidate");
        }
    }

    @Override // X.InterfaceC163006aW
    public final void LJIJJ(VideoPublishEditModel editModel, Intent intent, InterfaceC153045zY interfaceC153045zY, boolean z) {
        NLENode nLENode;
        C133765Mu c133765Mu;
        o.LJIIIZ(editModel, "editModel");
        synchronized (C41571GTf.class) {
            if (!C41571GTf.LIZ) {
                C41571GTf.LJIIIIZZ("fail", "ab close");
                return;
            }
            if (interfaceC153045zY == null) {
                C41571GTf.LIZIZ(editModel, "edit_pre_publish_ve_null");
                C41571GTf.LJIIIIZZ("fail", "edit_pre_publish_ve_null");
                return;
            }
            NLENode nLENode2 = null;
            if ((interfaceC153045zY instanceof C133765Mu) && (c133765Mu = (C133765Mu) interfaceC153045zY) != null) {
                nLENode2 = c133765Mu.LJFF().deepClone();
            }
            boolean z2 = true;
            if (nLENode2 != null && (nLENode = C41571GTf.LIZJ) != null && nLENode.unorderEquals(nLENode2) && !z) {
                z2 = false;
            }
            if (!C44384HbQ.LJLJI(editModel) && !z2) {
                String LIZLLL = C41571GTf.LIZLLL(interfaceC153045zY, editModel);
                if (LIZLLL != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("cancel pre publish reason:");
                    LIZ.append(LIZLLL);
                    C41571GTf.LJFF(X1D.LIZIZ(LIZ));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("notAllowSkipReason ");
                    LIZ2.append(LIZLLL);
                    C41571GTf.LIZIZ(editModel, X1D.LIZIZ(LIZ2));
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("notAllowSkipReason ");
                    LIZ3.append(LIZLLL);
                    C41571GTf.LJIIIIZZ("fail", X1D.LIZIZ(LIZ3));
                } else if (C41571GTf.LIZLLL != null) {
                    C41571GTf.LJIIIIZZ("success", "success");
                } else {
                    C41571GTf.LJIIIIZZ("fail", "already canceled by other case");
                }
                if (intent != null) {
                    CreativeModel creativeModel = editModel.creativeModel;
                    o.LJIIIIZZ(creativeModel, "editModel.creativeModel");
                    C78996UzQ.LJJIZ(intent, creativeModel);
                }
            }
            C41571GTf.LJFF("cancel pre publish reason: hasEditInfo");
            C41571GTf.LIZIZ(editModel, "edit page has edited!");
            C41571GTf.LJIIIIZZ("fail", "edit page has edited!");
        }
    }

    @Override // X.InterfaceC163006aW
    public final void LJ(ActivityC45651qj activityC45651qj, String videoPath, C43722HDy shareModel, String str, String str2) {
        o.LJIIIZ(videoPath, "videoPath");
        o.LJIIIZ(shareModel, "shareModel");
        if (!C44172HVg.LJIJ.isLogin()) {
            C44172HVg.LJIJ.LIZ(activityC45651qj, "video_edit_page", "click_shoot", null, new C41023G8d(new C41020G8a(activityC45651qj, videoPath, shareModel, str, str2)));
        } else {
            GW9.LIZ(activityC45651qj, videoPath, shareModel, str, str2);
        }
    }
}
