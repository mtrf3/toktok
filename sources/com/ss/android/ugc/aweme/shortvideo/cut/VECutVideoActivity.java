package com.ss.android.ugc.aweme.shortvideo.cut;

import X.AbstractActivityC162676Zz;
import X.C15070iV;
import X.C157236Fb;
import X.C16880lQ;
import X.C32I;
import X.C38499F9b;
import X.C43212Gxc;
import X.C44298Ha2;
import X.C44503HdL;
import X.C44504HdM;
import X.C44505HdN;
import X.C45685HwP;
import X.C46005I3t;
import X.C46006I3u;
import X.C46007I3v;
import X.C46048I5k;
import X.C62819Ol5;
import X.C65803Ps7;
import X.C6Z6;
import X.C77413UZt;
import X.EnumC82528WaC;
import X.G8G;
import X.HEO;
import X.KL2;
import X.ORZ;
import X.QD3;
import X.X1D;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel;
import com.ss.android.vesdk.clipparam.VEClipSourceParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS7S0002000_7;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class VECutVideoActivity extends AbstractActivityC162676Zz {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public C46005I3t LJLJLLL;
    public CutVideoViewModel LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();

    @Override // X.GBO
    public final boolean LLII() {
        return true;
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIJLIL(boolean z) {
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static {
        C16880lQ.LJLLJ(VECutVideoActivity.class);
    }

    @Override // X.GBO
    public final C43212Gxc LLFII() {
        return new C43212Gxc(R.color.cz, false, 6);
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIJI() {
        CutVideoViewModel cutVideoViewModel = this.LJLL;
        if (cutVideoViewModel != null) {
            if (!cutVideoViewModel.Ov0()) {
                C46005I3t c46005I3t = this.LJLJLLL;
                if (c46005I3t != null) {
                    CutVideoViewModel cutVideoViewModel2 = c46005I3t.LJLJLJ;
                    if (cutVideoViewModel2 != null) {
                        if (!cutVideoViewModel2.Ov0()) {
                            VideoEditViewModel videoEditViewModel = c46005I3t.LJLJLLL;
                            if (videoEditViewModel != null) {
                                int i = ((VideoSegment) ListProtector.get(videoEditViewModel.kv0(), 0)).width;
                                VideoEditViewModel videoEditViewModel2 = c46005I3t.LJLJLLL;
                                if (videoEditViewModel2 != null) {
                                    int min = Math.min(i, ((VideoSegment) ListProtector.get(videoEditViewModel2.kv0(), 0)).height);
                                    VideoEditViewModel videoEditViewModel3 = c46005I3t.LJLJLLL;
                                    if (videoEditViewModel3 != null) {
                                        int i2 = ((VideoSegment) ListProtector.get(videoEditViewModel3.kv0(), 0)).width;
                                        VideoEditViewModel videoEditViewModel4 = c46005I3t.LJLJLLL;
                                        if (videoEditViewModel4 != null) {
                                            int max = Math.max(i2, ((VideoSegment) ListProtector.get(videoEditViewModel4.kv0(), 0)).height);
                                            CutVideoPreviewViewModel cutVideoPreviewViewModel = c46005I3t.LJLLL;
                                            if (cutVideoPreviewViewModel != null) {
                                                cutVideoPreviewViewModel.setState(new AqS7S0002000_7(min, max, 3));
                                                return;
                                            } else {
                                                o.LJIJI("previewViewModel");
                                                throw null;
                                            }
                                        }
                                        o.LJIJI("videoEditViewModel");
                                        throw null;
                                    }
                                    o.LJIJI("videoEditViewModel");
                                    throw null;
                                }
                                o.LJIJI("videoEditViewModel");
                                throw null;
                            }
                            o.LJIJI("videoEditViewModel");
                            throw null;
                        }
                        return;
                    }
                    o.LJIJI("cutVideoViewModel");
                    throw null;
                }
                o.LJIJI("cutVideoRootScene");
                throw null;
            }
            return;
        }
        o.LJIJI("cutVideoViewModel");
        throw null;
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        CutVideoViewModel cutVideoViewModel = this.LJLL;
        if (cutVideoViewModel != null) {
            cutVideoViewModel.Pv0();
        } else {
            o.LJIJI("cutVideoViewModel");
            throw null;
        }
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        String str;
        String str2;
        String str3;
        super.finish();
        C45685HwP c45685HwP = C45685HwP.LJFF;
        if (c45685HwP != null) {
            c45685HwP.LIZ();
        }
        CutVideoViewModel cutVideoViewModel = this.LJLL;
        String str4 = null;
        if (cutVideoViewModel != null) {
            if (cutVideoViewModel.LJLJJLL != null && cutVideoViewModel.Mv0().LJII != null) {
                MicroAppModel microAppModel = cutVideoViewModel.Mv0().LJII;
                o.LJI(microAppModel);
                str = microAppModel.appId;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                CutVideoViewModel cutVideoViewModel2 = this.LJLL;
                if (cutVideoViewModel2 != null) {
                    MicroAppModel microAppModel2 = cutVideoViewModel2.Mv0().LJII;
                    if (microAppModel2 == null) {
                        str2 = null;
                    } else {
                        try {
                            str2 = microAppModel2.extra;
                        } catch (Exception e) {
                            C16880lQ.LLLLIIL(e);
                            return;
                        }
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        if (microAppModel2 != null) {
                            str3 = microAppModel2.extra;
                        } else {
                            str3 = null;
                        }
                        if (1 == new JSONObject(str3).optInt("timor_video_source")) {
                            HEO miniAppService = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getMiniAppService();
                            CutVideoViewModel cutVideoViewModel3 = this.LJLL;
                            if (cutVideoViewModel3 != null) {
                                if (cutVideoViewModel3.LJLJJLL != null && cutVideoViewModel3.Mv0().LJII != null) {
                                    MicroAppModel microAppModel3 = cutVideoViewModel3.Mv0().LJII;
                                    o.LJI(microAppModel3);
                                    str4 = microAppModel3.appId;
                                }
                                miniAppService.getClass();
                                C38499F9b.LIZ.LIZIZ().tryMoveMiniAppActivityToFront(str4);
                                return;
                            }
                            o.LJIJI("cutVideoViewModel");
                            throw null;
                        }
                        return;
                    }
                    return;
                }
                o.LJIJI("cutVideoViewModel");
                throw null;
            }
            return;
        }
        o.LJIJI("cutVideoViewModel");
        throw null;
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        G8G.LIZ.leave(this, "clip");
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
        C44298Ha2 c44298Ha2 = G8G.LIZ;
        CutVideoViewModel cutVideoViewModel = this.LJLL;
        if (cutVideoViewModel != null) {
            String str = cutVideoViewModel.Mv0().LJIIL;
            CutVideoViewModel cutVideoViewModel2 = this.LJLL;
            if (cutVideoViewModel2 != null) {
                c44298Ha2.pause(this, "clip", str, cutVideoViewModel2.Mv0().LJIIZILJ.getCreationId());
                return;
            } else {
                o.LJIJI("cutVideoViewModel");
                throw null;
            }
        }
        o.LJIJI("cutVideoViewModel");
        throw null;
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIIZ(boolean z) {
        int LIZJ;
        int i;
        CutVideoViewModel cutVideoViewModel = this.LJLL;
        if (cutVideoViewModel != null) {
            if (!cutVideoViewModel.Ov0()) {
                C46005I3t c46005I3t = this.LJLJLLL;
                if (c46005I3t != null) {
                    CutVideoViewModel cutVideoViewModel2 = c46005I3t.LJLJLJ;
                    if (cutVideoViewModel2 != null) {
                        if (!cutVideoViewModel2.Ov0()) {
                            C46007I3v c46007I3v = (C46007I3v) c46005I3t.LJLJJI.getValue();
                            c46007I3v.getClass();
                            int LJI = C157236Fb.LIZ.LJI();
                            ViewGroup.LayoutParams layoutParams = c46007I3v.LLJILJIL().mView.getLayoutParams();
                            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            if (z) {
                                LIZJ = LJI;
                            } else {
                                LIZJ = (int) KL2.LIZJ(c46007I3v.mActivity, 132.0f);
                            }
                            marginLayoutParams.height = LIZJ;
                            c46007I3v.LLJILJIL().mView.setLayoutParams(marginLayoutParams);
                            ViewGroup.LayoutParams layoutParams2 = c46007I3v.LLJILJILJ().mView.getLayoutParams();
                            o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                            if (z) {
                                i = (int) (KL2.LIZJ(c46007I3v.mActivity, 5.5f) + LJI);
                            } else {
                                i = 0;
                            }
                            marginLayoutParams2.bottomMargin = i;
                            c46007I3v.LLJILJILJ().mView.setLayoutParams(marginLayoutParams2);
                            return;
                        }
                        return;
                    }
                    o.LJIJI("cutVideoViewModel");
                    throw null;
                }
                o.LJIJI("cutVideoRootScene");
                throw null;
            }
            return;
        }
        o.LJIJI("cutVideoViewModel");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0035, code lost:
    
        if (r2 == false) goto L10;
     */
    @Override // X.AbstractActivityC162676Zz, X.GBO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity.onCreate(android.os.Bundle):void");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onEvent(C6Z6 event) {
        o.LJIIIZ(event, "event");
        finish();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        CutVideoViewModel cutVideoViewModel = this.LJLL;
        if (cutVideoViewModel != null) {
            if (cutVideoViewModel.LJLJJLL != null && cutVideoViewModel.Mv0().LJIIIZ != null) {
                CutVideoViewModel cutVideoViewModel2 = this.LJLL;
                if (cutVideoViewModel2 != null) {
                    outState.putParcelable("workspace", cutVideoViewModel2.Mv0().LJIIIZ);
                    return;
                } else {
                    o.LJIJI("cutVideoViewModel");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("cutVideoViewModel");
        throw null;
    }

    @Override // X.GB7, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle LLJJIJI;
        long longValue;
        long longValue2;
        List<VideoSegment> videoSegmentList;
        super.onActivityResult(i, i2, intent);
        C46005I3t c46005I3t = this.LJLJLLL;
        if (c46005I3t != null) {
            CutVideoViewModel cutVideoViewModel = c46005I3t.LJLJLJ;
            if (cutVideoViewModel != null) {
                if (cutVideoViewModel.Ov0()) {
                    C46006I3u LLJILJIL = c46005I3t.LLJILJIL();
                    LLJILJIL.getClass();
                    if (i == 1001) {
                        if (i2 != -1 || intent == null) {
                            return;
                        }
                        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
                        if (!C77413UZt.LJIILL(parcelableArrayListExtra)) {
                            ArrayList arrayList = new ArrayList();
                            VideoEditViewModel videoEditViewModel = LLJILJIL.LJLJI;
                            if (videoEditViewModel != null) {
                                int size = videoEditViewModel.kv0().size();
                                o.LJI(parcelableArrayListExtra);
                                int size2 = parcelableArrayListExtra.size();
                                boolean z = false;
                                for (int i3 = 0; i3 < size2; i3++) {
                                    VideoSegment videoSegment = new VideoSegment((MediaModel) ListProtector.get(parcelableArrayListExtra, i3));
                                    videoSegment.videoIndex = size;
                                    arrayList.add(videoSegment);
                                    size++;
                                }
                                C46048I5k c46048I5k = LLJILJIL.LLJILJILJ().LJLIL;
                                if (c46048I5k != null) {
                                    c46048I5k.LJLLLLLL(arrayList);
                                }
                                LLJILJIL.LLJILJIL().LLJILJILJ().LIZLLL(arrayList);
                                VECutVideoPresenter vECutVideoPresenter = LLJILJIL.LJLIL;
                                if (vECutVideoPresenter != null) {
                                    VideoEditViewModel videoEditViewModel2 = LLJILJIL.LJLJI;
                                    if (videoEditViewModel2 != null) {
                                        int size3 = videoEditViewModel2.kv0().size();
                                        C15070iV<Long, Long> LLIIZ = vECutVideoPresenter.LJLILLLLZI.LLIIZ();
                                        Long l = LLIIZ.LIZ;
                                        if (l == null) {
                                            longValue = 0;
                                        } else {
                                            longValue = l.longValue();
                                        }
                                        Long l2 = LLIIZ.LIZIZ;
                                        if (l2 == null) {
                                            longValue2 = vECutVideoPresenter.LJLILLLLZI.LLIIIL();
                                        } else {
                                            longValue2 = l2.longValue();
                                        }
                                        C44503HdL c44503HdL = vECutVideoPresenter.LJZL;
                                        C44504HdM c44504HdM = c44503HdL.LIZIZ;
                                        if (c44504HdM != null && !C77413UZt.LJIILL(arrayList)) {
                                            C62819Ol5.LIZLLL(c44504HdM.LIZIZ, arrayList);
                                        }
                                        C44505HdN c44505HdN = c44503HdL.LIZ;
                                        if (c44505HdN != null && !arrayList.isEmpty()) {
                                            C62819Ol5.LIZLLL(c44505HdN.LIZIZ, arrayList);
                                        }
                                        C44505HdN c44505HdN2 = c44503HdL.LIZ;
                                        if (c44505HdN2 != null && !arrayList.isEmpty()) {
                                            int size4 = arrayList.size();
                                            ArrayList arrayList2 = new ArrayList(size4);
                                            ArrayList arrayList3 = new ArrayList(size4);
                                            Iterator it = arrayList.iterator();
                                            while (it.hasNext()) {
                                                VideoSegment videoSegment2 = (VideoSegment) it.next();
                                                VEClipSourceParam vEClipSourceParam = new VEClipSourceParam();
                                                String LJII = videoSegment2.LJII(z);
                                                LJII.toString();
                                                vEClipSourceParam.clipFilePath = LJII;
                                                vEClipSourceParam.clipWidth = videoSegment2.width;
                                                vEClipSourceParam.clipHeight = videoSegment2.height;
                                                arrayList2.add(vEClipSourceParam);
                                                VEClipTimelineParam vEClipTimelineParam = new VEClipTimelineParam();
                                                vEClipTimelineParam.speed = EnumC82528WaC.NORMAL.value();
                                                vEClipTimelineParam.trimIn = 0;
                                                vEClipTimelineParam.trimOut = (int) videoSegment2.duration;
                                                arrayList3.add(vEClipTimelineParam);
                                                z = false;
                                            }
                                            c44505HdN2.LIZ.LLJLLIL(size3 - arrayList.size(), arrayList2, arrayList3);
                                            c44505HdN2.LIZ.LLLFZ((int) longValue, (int) longValue2);
                                        }
                                    } else {
                                        o.LJIJI("videoEditViewModel");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("presenter");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("videoEditViewModel");
                                throw null;
                            }
                        }
                        VideoEditViewModel videoEditViewModel3 = LLJILJIL.LJLJI;
                        if (videoEditViewModel3 != null) {
                            CutVideoContext value = videoEditViewModel3.LLD.getValue();
                            if (value == null || (videoSegmentList = value.getVideoSegmentList()) == null) {
                                return;
                            }
                            ArrayList arrayList4 = new ArrayList(C32I.LJJL(videoSegmentList, 10));
                            Iterator<VideoSegment> it2 = videoSegmentList.iterator();
                            while (it2.hasNext()) {
                                arrayList4.add(Long.valueOf(it2.next().duration));
                            }
                            if (ORZ.LLILLJJLI(arrayList4) <= 60000) {
                                return;
                            }
                            LLJILJIL.LLJJ();
                            return;
                        }
                        o.LJIJI("videoEditViewModel");
                        throw null;
                    }
                }
                if (i == 1002) {
                    Intent intent2 = new Intent();
                    if (intent != null && C16880lQ.LLJJIJI(intent) != null) {
                        Bundle LLJJIJI2 = C16880lQ.LLJJIJI(intent);
                        o.LJI(LLJJIJI2);
                        String string = LLJJIJI2.getString("edit result");
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("RecordActivity return success ");
                        o.LJI(string);
                        LIZ.append(string);
                        intent2.putExtra("record result", X1D.LIZIZ(LIZ));
                    }
                    setResult(-1, intent2);
                    finish();
                    return;
                }
                if (i != 8 || i2 != 9) {
                    return;
                }
                Intent intent3 = new Intent();
                if (intent != null && (LLJJIJI = C16880lQ.LLJJIJI(intent)) != null) {
                    intent3.putExtras(LLJJIJI);
                }
                setResult(9, intent3);
                finish();
                return;
            }
            o.LJIJI("cutVideoViewModel");
            throw null;
        }
        o.LJIJI("cutVideoRootScene");
        throw null;
    }
}
