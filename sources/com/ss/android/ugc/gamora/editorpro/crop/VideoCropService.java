package com.ss.android.ugc.gamora.editorpro.crop;

import X.ActivityC45651qj;
import X.AnonymousClass519;
import X.C124574uj;
import X.C124994vP;
import X.C127834zz;
import X.C132805Jc;
import X.C2ND;
import X.C34K;
import X.C43045Guv;
import X.C50J;
import X.C55A;
import X.C58096Mr6;
import X.C76800UCe;
import X.C79057V0z;
import X.C84363X9b;
import X.InterfaceC1278950f;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import android.content.Intent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider;
import com.ss.ugc.android.editor.components.base.api.IPreviewService;
import com.ss.ugc.android.editor.components.base.api.IVideoCropService;
import com.ss.ugc.android.editor.core.EditorProContext;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS66S0201000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class VideoCropService implements IVideoCropService {
    public String activityTag = "";
    public volatile boolean isCropPanelShowing;

    public static IVideoCropService createIVideoCropServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IVideoCropService.class, z);
        if (LIZ != null) {
            return (IVideoCropService) LIZ;
        }
        if (C58096Mr6.E8 == null) {
            synchronized (IVideoCropService.class) {
                if (C58096Mr6.E8 == null) {
                    C58096Mr6.E8 = new VideoCropService();
                }
            }
        }
        return C58096Mr6.E8;
    }

    @Override // com.ss.ugc.android.editor.components.base.api.IVideoCropService
    public void processCropResult(ActivityC45651qj activity, Intent data) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(data, "data");
    }

    @Override // com.ss.ugc.android.editor.components.base.api.IVideoCropService
    public void startCrop(ActivityC45651qj activity, NLETrackSlot slot) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(slot, "slot");
    }

    private final void preloadCropData(EditorProContext editorProContext, NLEModel nLEModel, long j) {
        editorProContext.getNleSession().R8(nLEModel);
        editorProContext.getNleSession().V8().prepare();
        editorProContext.getNleSession().V8().LJIIZILJ(C124574uj.LJJLIIIJJIZ(j));
    }

    private final void seek(EditorProContext editorProContext, long j, long j2, final AnonymousClass519 anonymousClass519) {
        final C34K c34k = new C34K();
        editorProContext.getPlayer().A3(j, new AnonymousClass519() { // from class: X.518
            @Override // X.AnonymousClass519
            public final void LIZ(int i) {
                C2ND.LIZIZ(new AqS66S0201000_2(C34K.this, anonymousClass519, i, 5), 0L);
            }
        });
        C2ND.LIZ(new AqS149S0200000_2(c34k, anonymousClass519, 55), j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pushCropScene(X.ActivityC45651qj r16, com.bytedance.scene.navigation.NavigationScene r17, com.ss.ugc.android.editor.core.EditorProContext r18, final X.InterfaceC88472Yns<? super X.C50J, X.C76800UCe> r19) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.crop.VideoCropService.pushCropScene(X.1qj, com.bytedance.scene.navigation.NavigationScene, com.ss.ugc.android.editor.core.EditorProContext, X.Yns):void");
    }

    @Override // com.ss.ugc.android.editor.components.base.api.IVideoCropService
    public void startCrop(NavigationScene navigationScene, ActivityC45651qj activity, NLETrackSlot slot, InterfaceC88472Yns<? super C50J, C76800UCe> interfaceC88472Yns) {
        InterfaceC1278950f previewPanel;
        SurfaceView Jq;
        ViewGroup viewGroup;
        o.LJIIIZ(navigationScene, "navigationScene");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(slot, "slot");
        if (this.isCropPanelShowing && o.LJ(this.activityTag, String.valueOf(activity.hashCode()))) {
            return;
        }
        EditorProContext.Companion.getClass();
        EditorProContext LIZ = C124994vP.LIZ();
        IPreviewService LIZIZ = C127834zz.LIZIZ();
        if (LIZIZ == null || (previewPanel = LIZIZ.getPreviewPanel()) == null || (Jq = previewPanel.Jq()) == null) {
            return;
        }
        ViewParent parent = Jq.getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        this.isCropPanelShowing = true;
        this.activityTag = String.valueOf(activity.hashCode());
        ViewGroup.LayoutParams layoutParams = Jq.getLayoutParams();
        int indexOfChild = viewGroup.indexOfChild(Jq);
        long H9 = LIZ.getPlayer().H9();
        LIZ.getPlayer().R9();
        View ol0 = previewPanel.ol0(true);
        if (ol0 == null) {
            this.isCropPanelShowing = false;
            return;
        }
        C79057V0z.LJJJJL(LIZ, "show_preview_placeholder", Boolean.TRUE);
        C84363X9b.LIZ(ol0, new AqS148S0200000_1(ol0, (View) new C55A(LIZ, Jq, viewGroup, this, activity, navigationScene, indexOfChild, layoutParams, interfaceC88472Yns, H9), (InterfaceC65784Pro<C76800UCe>) 19));
        VideoPublishEditModel LIZIZ2 = C132805Jc.LIZIZ(EditModelProvider.Companion);
        if (LIZIZ2 == null) {
            return;
        }
        C43045Guv.LIZIZ(new AqS149S0200000_2(LIZIZ2, LIZ, 101));
    }

    public static /* synthetic */ void seek$default(VideoCropService videoCropService, EditorProContext editorProContext, long j, long j2, AnonymousClass519 anonymousClass519, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 3000;
        }
        videoCropService.seek(editorProContext, j, j2, anonymousClass519);
    }
}
