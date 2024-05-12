package com.ss.android.ugc.aweme.shortvideo.video2sticker;

import X.AbstractC42651GoZ;
import X.C140945g2;
import X.C144245lM;
import X.C144925mS;
import X.C157546Gg;
import X.C16880lQ;
import X.C221108m2;
import X.C43542H7a;
import X.C44384HbQ;
import X.C5HC;
import X.C5L7;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C6D8;
import X.C6VC;
import X.C78688UuS;
import X.C78897Uxp;
import X.C82622Wbi;
import X.InterfaceC136385Ww;
import X.InterfaceC137115Zr;
import X.InterfaceC143985kw;
import X.InterfaceC144015kz;
import X.InterfaceC144185lG;
import X.InterfaceC144495ll;
import X.InterfaceC147355qN;
import X.InterfaceC45540Hu4;
import X.J9A;
import X.ORZ;
import Y.ARunnableS37S0100000_1;
import Y.ARunnableS38S0100000_2;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.video2sticker.OriginVideoInfo;
import com.ss.android.ugc.aweme.creative.model.video2sticker.Video2StickerModel;
import com.ss.android.ugc.aweme.creative.model.video2sticker.VideoTimeTrimData;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.video2sticker.Video2StickerEditRootScene;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class Video2StickerEditRootScene extends AbstractC42651GoZ implements InterfaceC137115Zr, InterfaceC45540Hu4 {
    public VideoPublishEditModel LJLJJL;
    public InterfaceC144015kz LJLJJLL;
    public InterfaceC143985kw LJLJL;
    public InterfaceC144495ll LJLJLJ;
    public InterfaceC136385Ww LJLJLLL;
    public C6VC LJLL;
    public final List<InterfaceC144185lG> LJLLI = new ArrayList();
    public final List<C5HC> LJLLILLLL = new ArrayList();
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 289));

    @Override // X.InterfaceC137115Zr
    public final void LJII(StickerItemModel stickerItemModel) {
    }

    @Override // X.InterfaceC137115Zr
    public final InterfaceC147355qN LJLLL() {
        VideoPublishEditModel videoPublishEditModel = this.LJLJJL;
        if (videoPublishEditModel != null) {
            return new C140945g2(videoPublishEditModel);
        }
        o.LJIJI("model");
        throw null;
    }

    @Override // X.AbstractC42651GoZ
    public final boolean onBackPressed() {
        List<C5HC> list = this.LJLLILLLL;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<C5HC> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().onKeyDown(4, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListener(C5HC listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJLLILLLL).add(listener);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListenerHead(C5HC listener) {
        o.LJIIIZ(listener, "listener");
        ListProtector.add(this.LJLLILLLL, 0, listener);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityResultListener(InterfaceC144185lG listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJLLI).add(listener);
    }

    @Override // X.InterfaceC45540Hu4
    public final void unRegisterActivityOnKeyDownListener(C5HC listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJLLILLLL).remove(listener);
    }

    @Override // X.InterfaceC45540Hu4
    public final void unRegisterActivityResultListener(InterfaceC144185lG listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJLLI).remove(listener);
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Intent intent = requireActivity().getIntent();
        o.LJIIIIZZ(intent, "requireActivity().intent");
        new C43542H7a("");
        VideoPublishEditModel LJII = C43542H7a.LJII(C16880lQ.LLJJIJI(intent));
        this.LJLJJL = LJII;
        Video2StickerModel video2StickerModel = LJII.creativeModel.video2StickerModel;
        if (video2StickerModel != null) {
            OriginVideoInfo originVideoInfo = video2StickerModel.originVideoInfo;
            EditVideoSegment editVideoSegment = (EditVideoSegment) ORZ.LJLLJ(LJII.getPreviewInfo().getVideoList());
            originVideoInfo.width = editVideoSegment.getVideoFileInfo().getWidth();
            originVideoInfo.height = editVideoSegment.getVideoFileInfo().getHeight();
            originVideoInfo.duration = editVideoSegment.getVideoFileInfo().getDuration();
            long j = video2StickerModel.originVideoInfo.coverTsp;
            long LIZIZ = J9A.LIZIZ("video2sticker_max_selected_duration", 2500L);
            long j2 = video2StickerModel.originVideoInfo.duration;
            if (j2 - j < 100) {
                j = 0;
            }
            if (j2 - j >= LIZIZ) {
                j2 = j + LIZIZ;
            }
            VideoTimeTrimData videoTimeTrimData = video2StickerModel.videoTimeTrimData;
            videoTimeTrimData.startTime = j;
            videoTimeTrimData.endTime = j2;
        }
        View requireViewById = requireViewById(R.id.drl);
        o.LJIIIIZZ(requireViewById, "requireViewById<FrameLay…>(R.id.gesture_container)");
        Context requireSceneContext = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
        this.LJLL = C78897Uxp.LJIILIIL(requireSceneContext, (ViewGroup) requireViewById);
        ViewGroup.LayoutParams layoutParams = requireViewById(R.id.kej).getLayoutParams();
        Context requireSceneContext2 = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext2, "requireSceneContext()");
        layoutParams.height = C63081OpJ.LJJJJLI(requireSceneContext2);
        ((View) this.LJLLJ.getValue()).post(new ARunnableS37S0100000_1(this, 13));
        ((View) this.LJLLJ.getValue()).post(new ARunnableS38S0100000_2(this, 22));
        registerActivityResultListener(new InterfaceC144185lG() { // from class: X.5lF
            @Override // X.InterfaceC144185lG
            public final boolean onActivityResult(int i, int i2, Intent intent2) {
                Activity activity;
                if (i == 100 && i2 == -1 && (activity = Video2StickerEditRootScene.this.mActivity) != null) {
                    activity.finish();
                    return true;
                }
                return true;
            }
        });
        C78688UuS.LJIIIZ(this, false, new AqS168S0100000_2(this, 39));
        C44384HbQ.LJIIIZ(this, new AqS168S0100000_2(this, 40));
        C82622Wbi c82622Wbi = C44384HbQ.LJJJI(this).LJLLL;
        if (c82622Wbi != null) {
            this.LJLJJLL = (InterfaceC144015kz) c82622Wbi.LJ(InterfaceC144015kz.class, null);
            c82622Wbi.LJ(C144245lM.class, null);
            this.LJLJL = (InterfaceC143985kw) c82622Wbi.LJ(InterfaceC143985kw.class, null);
            this.LJLJLJ = (InterfaceC144495ll) c82622Wbi.LJ(C144925mS.class, null);
            this.LJLJLLL = (InterfaceC136385Ww) c82622Wbi.LJ(C157546Gg.class, null);
            ViewGroup viewGroup = (ViewGroup) requireViewById(R.id.i2k);
            InterfaceC144015kz interfaceC144015kz = this.LJLJJLL;
            if (interfaceC144015kz != null) {
                viewGroup.addView(interfaceC144015kz.Iy());
                return;
            } else {
                o.LJIJI("editPreviewApi");
                throw null;
            }
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.AbstractC42651GoZ
    public final void onActivityResult(int i, int i2, Intent intent) {
        Iterator it = ((ArrayList) this.LJLLI).iterator();
        while (it.hasNext() && !((InterfaceC144185lG) it.next()).onActivityResult(i, i2, intent)) {
        }
    }

    @Override // X.AbstractC147255qD, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.is, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
        C5L7.LIZIZ();
        return viewGroup2;
    }
}
