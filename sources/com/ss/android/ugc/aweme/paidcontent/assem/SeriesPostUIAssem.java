package com.ss.android.ugc.aweme.paidcontent.assem;

import X.A22;
import X.A2J;
import X.A2R;
import X.A2S;
import X.A2T;
import X.ActivityC45651qj;
import X.C145995oB;
import X.C164096cH;
import X.C16880lQ;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C234529Ii;
import X.C252709vu;
import X.C29822Bn8;
import X.C32151Nz;
import X.C36922EeM;
import X.C41315GJj;
import X.C43587H8t;
import X.C44224HXg;
import X.C44739Hh9;
import X.C46104I7o;
import X.C47704Ins;
import X.C55749LuL;
import X.C58B;
import X.C5YW;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.C9KF;
import X.EnumC43590H8w;
import X.FMX;
import X.H7R;
import X.H83;
import X.SY4;
import X.T5T;
import X.TBT;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import Y.ACListenerS22S0100000_2;
import Y.ACListenerS37S0200000_2;
import Y.IDTListenerS114S0100000_4;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.SeriesListViewModel;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.SeriesPostViewModel;
import com.ss.android.ugc.aweme.services.publish.Publish;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder;
import com.ss.android.ugc.aweme.shortvideo.ui.savelocal.SaveLocalHelper;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SeriesPostUIAssem extends UIContentAssem {
    public T5T LJLIL;
    public SY4 LJLILLLLZI;
    public C252709vu LJLJI;
    public C164096cH LJLJJI;
    public TextView LJLJJL;
    public final C214298b3 LJLJJLL;
    public final C214298b3 LJLJL;
    public final C55749LuL LJLJLJ;
    public final boolean LJLJLLL;
    public VideoCoverBitmapHolder LJLL;
    public final C62822Ol8 LJLLI;

    public SeriesPostUIAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SeriesListViewModel.class);
        this.LJLJJLL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 564), A2R.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(SeriesPostViewModel.class);
        this.LJLJL = C78926UyI.LJ(this, LIZ2, c9be, new AqS154S0100000_4(LIZ2, 565), A2S.INSTANCE, null);
        this.LJLJLJ = new C55749LuL(C47704Ins.LIZJ(this, A22.class, null), checkSupervisorPrepared());
        this.LJLJLLL = C58B.LIZ();
        this.LJLLI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 563));
    }

    public final SeriesListViewModel A3() {
        return (SeriesListViewModel) this.LJLJJLL.getValue();
    }

    public final A22 x3() {
        return (A22) this.LJLJLJ.getValue();
    }

    public static Bundle v3(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        int i;
        if (C44739Hh9.LIZIZ()) {
            AVUploadSaveModel aVUploadSaveModel = new AVUploadSaveModel();
            if (TextUtils.isEmpty(aVUploadSaveModel.getLocalTempPath())) {
                aVUploadSaveModel.setLocalTempPath(C5YW.LIZIZ().LJIIIZ(videoPublishEditModel.creativeInfo));
            }
            aVUploadSaveModel.setWaterMark(C46104I7o.LJJIJIIJIL());
            boolean LJJJJLL = H7R.LJJJJLL(videoPublishEditModel);
            boolean LIZ = SaveLocalHelper.LIZ(LJJJJLL);
            aVUploadSaveModel.setSaveLocal(LIZ);
            aVUploadSaveModel.setSaveType(LIZ ? 1 : 0);
            aVUploadSaveModel.setSaveToAlbum(LIZ);
            if (SaveLocalHelper.LIZIZ(LJJJJLL) == 2) {
                z = true;
            } else {
                z = false;
            }
            aVUploadSaveModel.setSaveWithCaption(z);
            videoPublishEditModel.setSaveModel(aVUploadSaveModel);
        }
        C43587H8t.LIZJ(H83.LIZ(videoPublishEditModel), new C44224HXg(videoPublishEditModel), EnumC43590H8w.PUBLISH, EnumC43590H8w.SEND_REQUEST);
        videoPublishEditModel.userClickPublishTime = videoPublishEditModel.creativeModel.transientPostPageModel.LJ;
        Bundle bundle = new Bundle();
        if (H7R.LJJJJL(videoPublishEditModel)) {
            i = 11;
        } else {
            i = 0;
        }
        bundle.putInt("video_type", i);
        bundle.putSerializable("extra_video_publish_args", videoPublishEditModel);
        bundle.putString("shoot_way", videoPublishEditModel.mShootWay);
        bundle.putString("creation_id", videoPublishEditModel.getCreationId());
        bundle.putInt("extra_stick_point_type", 0);
        bundle.putBoolean("enter_record_from_other_platform", false);
        bundle.putBoolean("extra_enter_from_live", false);
        bundle.putInt("publish_private_state", videoPublishEditModel.isPrivate());
        bundle.putInt("publish_permission", videoPublishEditModel.isPrivate());
        bundle.putBoolean("publish_high_quality_with_prompt", C41315GJj.LIZIZ(videoPublishEditModel));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("VideoPublishService.createBundleParams()  bundle=");
        LIZ2.append(bundle);
        C36922EeM.LJ(X1D.LIZIZ(LIZ2));
        C145995oB c145995oB = new C145995oB();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("VideoPublishService.createBundleParams()  bundle=");
        LIZ3.append(bundle);
        c145995oB.LJI("log", X1D.LIZIZ(LIZ3));
        FMX.LJIIL("av_video_memory", c145995oB.LIZ);
        Publish.PublishBundle = bundle;
        return bundle;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        C252709vu c252709vu;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        T5T t5t = (T5T) getContainerView().findViewById(R.id.cqu);
        this.LJLIL = t5t;
        if (t5t != null) {
            t5t.requestFocusFromTouch();
        }
        T5T t5t2 = this.LJLIL;
        if (t5t2 != null) {
            t5t2.setOnFocusChangeListener(A2T.LJLIL);
        }
        getContainerView().findViewById(R.id.jpe).setOnTouchListener(new IDTListenerS114S0100000_4(this, 8));
        getContainerView().setOnTouchListener(new IDTListenerS114S0100000_4(this, 9));
        VideoCoverBitmapHolder videoCoverBitmapHolder = new VideoCoverBitmapHolder();
        getLifecycle().addObserver(videoCoverBitmapHolder);
        this.LJLL = videoCoverBitmapHolder;
        TextView textView = (TextView) getContainerView().findViewById(R.id.bat);
        this.LJLJJL = textView;
        if (this.LJLJLLL && textView != null) {
            textView.setBackgroundResource(R.drawable.sn);
        }
        TextView textView2 = this.LJLJJL;
        if (textView2 != null) {
            C16880lQ.LJIJI(textView2, new ACListenerS22S0100000_2(this, 90));
        }
        this.LJLJJI = (C164096cH) getContainerView().findViewById(R.id.egl);
        VideoPublishEditModel videoPublishEditModel = x3().LJLIL;
        if (videoPublishEditModel != null) {
            C164096cH c164096cH = this.LJLJJI;
            if (c164096cH != null) {
                c164096cH.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            C164096cH c164096cH2 = this.LJLJJI;
            if (c164096cH2 != null) {
                if (this.LJLJLLL) {
                    i = 6;
                } else {
                    i = 2;
                }
                C164096cH.LIZIZ(c164096cH2, C32151Nz.LJIIZILJ(Integer.valueOf(i)));
            }
            AqS133S0200000_2 aqS133S0200000_2 = new AqS133S0200000_2(this, videoPublishEditModel, 86);
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            if (LIZ != null) {
                aqS133S0200000_2.invoke(LIZ);
            }
            C164096cH c164096cH3 = this.LJLJJI;
            if (c164096cH3 != null) {
                c164096cH3.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS37S0200000_2(videoPublishEditModel, this, 9)));
            }
        }
        this.LJLJI = (C252709vu) getContainerView().findViewById(R.id.l_2);
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
        C252709vu c252709vu2 = this.LJLJI;
        if (c252709vu2 != null) {
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_chevron_left_ltr;
            LIZJ.LIZLLL = true;
            LIZJ.LIZIZ(new AqS154S0100000_4(LIZ2, 1014));
            c252709vu2.LIZJ(LIZJ);
        }
        Context context = getContext();
        if (context != null && (c252709vu = this.LJLJI) != null) {
            C9KF c9kf = new C9KF();
            c9kf.LIZJ = C29822Bn8.LIZ(context, R.string.qk4, "ctx.resources.getString(…ries_allseries_pagetitle)");
            c252709vu.LJIILLIIL(c9kf);
        }
        SY4 sy4 = (SY4) getContainerView().findViewById(R.id.h0v);
        this.LJLILLLLZI = sy4;
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new A2J(this));
        }
        C8YN.LJII(this, A3(), new TBT() { // from class: X.A1a
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((A1P) obj).LJLJI);
            }
        }, null, new AqS186S0100000_4(this, 246), 6);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.A26
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((A1P) obj).LJLILLLLZI;
            }
        }, null, new AqS186S0100000_4(this, 247), 6);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLJL.getValue(), new TBT() { // from class: X.9qG
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C249189qE) obj).LJLJI;
            }
        }, null, new AqS170S0100000_4(this, 888), new AqS154S0100000_4(this, 1017), new AqS170S0100000_4(this, 889), 2, null);
        VideoPublishEditModel videoPublishEditModel2 = x3().LJLIL;
        if (videoPublishEditModel2 != null) {
            AqS135S0200000_4 aqS135S0200000_4 = new AqS135S0200000_4(this, videoPublishEditModel2, 131);
            ActivityC45651qj LIZ3 = C212428Vi.LIZ(this);
            if (LIZ3 != null) {
                aqS135S0200000_4.invoke(LIZ3);
            }
        }
        C8YN.LJII(this, (AssemViewModel) this.LJLJL.getValue(), new TBT() { // from class: X.9qH
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C249189qE) obj).LJLIL;
            }
        }, null, new AqS186S0100000_4(this, 245), 6);
    }
}
