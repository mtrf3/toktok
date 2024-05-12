package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes15.dex */
public final class WF7 extends AbstractC029409q<RecyclerView.ViewHolder> {
    public int LJLIL;
    public Context LJLILLLLZI;
    public List<C15070iV<String, C15070iV<Integer, Integer>>> LJLJJI;
    public final WF6 LJLJJL;
    public List<VideoSegment> LJLJL;
    public MutableLiveData<Bitmap> LJLJLJ;
    public MutableLiveData<Boolean> LJLJLLL;
    public final int LJLL;
    public int LJLLI;
    public final int LJLLILLLL;
    public final WFB LJLLJ;
    public final boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLZ;
    public InterfaceC153045zY LJZ;
    public final HashMap<String, Float> LJLJI = new HashMap<>();
    public List<VideoSegment> LJLJJLL = new ArrayList();
    public final List<Bitmap> LJLLLLLL = new ArrayList();

    public final void LJLLLLLL() {
        Context context;
        if (this.LJLZ) {
            int LJLZ = LJLZ((int) ((VideoSegment) ListProtector.get(this.LJLJJLL, 0)).duration, ((VideoSegment) ListProtector.get(this.LJLJJLL, 0)).LJII(true));
            Object LLILL = C16880lQ.LLILL(this.LJLILLLLZI, WM7.SCENE_SERVICE);
            if (LLILL instanceof WM7) {
                context = ((WM7) LLILL).mActivity;
            } else {
                context = this.LJLILLLLZI;
            }
            C6YX c6yx = new C6YX();
            c6yx.LJIILL = this.LJLLL;
            c6yx.LJIILJJIL = this.LJLL;
            c6yx.LJIIL = this.LJLJLLL;
            c6yx.LJIIJJI = this.LJLJLJ;
            c6yx.LIZ(context, this.LJZ, LJLZ, new C5UO() { // from class: X.WF9
                @Override // X.C5UO
                public final void LIZ(List list) {
                    WF7 wf7 = WF7.this;
                    wf7.getClass();
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    ((ArrayList) wf7.LJLLLLLL).clear();
                    ((ArrayList) wf7.LJLLLLLL).addAll(list);
                    wf7.notifyDataSetChanged();
                }
            });
        }
        notifyDataSetChanged();
    }

    public final void LJZI() {
        WF6 wf6 = this.LJLJJL;
        if (wf6 != null) {
            wf6.LIZLLL();
        }
    }

    public final void LL() {
        int LJLZ;
        List<C15070iV<String, C15070iV<Integer, Integer>>> list = this.LJLJJI;
        if (list == null) {
            this.LJLJJI = new ArrayList();
        } else {
            list.clear();
        }
        int i = 0;
        for (int i2 = 0; i2 < this.LJLJJLL.size(); i2++) {
            VideoSegment videoSegment = (VideoSegment) ListProtector.get(this.LJLJJLL, i2);
            if (this.LJLIL == 1) {
                LJLZ = LJLZ((int) (videoSegment.LJ() - videoSegment.LJIIIZ()), videoSegment.LJII(true));
            } else {
                LJLZ = LJLZ((int) videoSegment.duration, videoSegment.LJII(true));
            }
            Integer valueOf = Integer.valueOf(i);
            i += LJLZ;
            this.LJLJJI.add(new C15070iV<>(videoSegment.LJII(true), new C15070iV(valueOf, Integer.valueOf(i - 1))));
        }
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        int LJLZ;
        if (this.LJLZ) {
            return ((ArrayList) this.LJLLLLLL).size();
        }
        WFB wfb = this.LJLLJ;
        if (wfb != null) {
            return wfb.LIZJ;
        }
        if (C78886Uxe.LJJIJ(this.LJLJJLL)) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < ((ArrayList) this.LJLJJLL).size(); i2++) {
            if (this.LJLIL == 1) {
                LJLZ = LJLZ((int) (((VideoSegment) ListProtector.get(this.LJLJJLL, i2)).end - ((VideoSegment) ListProtector.get(this.LJLJJLL, i2)).start), ((VideoSegment) ListProtector.get(this.LJLJJLL, i2)).LJII(true));
            } else {
                LJLZ = LJLZ((int) ((VideoSegment) ListProtector.get(this.LJLJJLL, i2)).duration, ((VideoSegment) ListProtector.get(this.LJLJJLL, i2)).LJII(true));
            }
            i += LJLZ;
        }
        return i;
    }

    public final void LJZL(HashMap<String, Float> hashMap) {
        for (String str : hashMap.keySet()) {
            this.LJLJI.put(str, Float.valueOf(hashMap.get(str).floatValue() * this.LJLL));
        }
        WF6 wf6 = this.LJLJJL;
        if (wf6 != null) {
            wf6.LIZLLL();
        }
        LL();
        LJLLLLLL();
    }

    @Override // X.AbstractC029409q
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof WF3) {
            C81392Vwy.LJ(((WF3) viewHolder).LJLILLLLZI);
        }
    }

    public WF7(Context context, WF8 wf8) {
        this.LJLLL = false;
        int[] iArr = wf8.LIZ;
        this.LJLL = iArr[0];
        this.LJLLI = iArr[1];
        this.LJLLILLLL = iArr[2];
        this.LJLLL = wf8.LJFF;
        List<VideoSegment> list = wf8.LIZIZ;
        HashMap<String, Float> hashMap = wf8.LIZJ;
        int i = wf8.LIZLLL;
        this.LJLILLLLZI = context;
        this.LJLIL = i;
        for (int i2 = 0; i2 < list.size(); i2++) {
            VideoSegment videoSegment = (VideoSegment) ListProtector.get(list, i2);
            this.LJLJI.put(videoSegment.LJII(true), Float.valueOf(hashMap.get(videoSegment.LJII(true)).floatValue() * this.LJLL));
        }
        this.LJLJL = list;
        WFB wfb = wf8.LJ;
        if (wfb != null) {
            this.LJLLJ = wfb;
            this.LJLJJL = new WFA(wfb);
        } else {
            this.LJLJJL = new VEMediaParserFrameProviderImpl(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r3 <= 0.0f) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJLZ(int r5, java.lang.String r6) {
        /*
            r4 = this;
            java.util.HashMap<java.lang.String, java.lang.Float> r0 = r4.LJLJI
            java.lang.Object r0 = r0.get(r6)
            if (r0 == 0) goto L46
            java.util.HashMap<java.lang.String, java.lang.Float> r0 = r4.LJLJI
            java.lang.Object r0 = r0.get(r6)
            java.lang.Float r0 = (java.lang.Float) r0
            float r3 = r0.floatValue()
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L3d
        L19:
            X.5NP r2 = X.C82891Wg3.LIZLLL()
            java.lang.String r1 = "duration: "
            java.lang.String r0 = " oneFrameDurMap"
            java.lang.StringBuilder r1 = X.C7MY.LJ(r1, r5, r0)
            java.util.HashMap<java.lang.String, java.lang.Float> r0 = r4.LJLJI
            java.lang.Object r0 = r0.get(r6)
            r1.append(r0)
            java.lang.String r0 = " path: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.w(r0)
        L3d:
            float r0 = (float) r5
            float r0 = r0 / r3
            double r0 = (double) r0
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            return r0
        L46:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WF7.LJLZ(int, java.lang.String):int");
    }

    public final void LJZ(HashMap hashMap, VideoSegment videoSegment) {
        ((ArrayList) this.LJLJJLL).clear();
        ((ArrayList) this.LJLJJLL).add(videoSegment);
        LJZL(hashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        float min;
        float f;
        float floatValue;
        final int i2 = i;
        if (viewHolder instanceof WF3) {
            if (this.LJLLLL) {
                int itemCount = getItemCount();
                int i3 = (itemCount - i2) - 1;
                if (i3 >= 0 && i3 < itemCount) {
                    i2 = i3;
                }
            }
            if (this.LJLLJ != null) {
                final WF3 wf3 = (WF3) viewHolder;
                wf3.getClass();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wf3.LJLIL.getLayoutParams();
                WF7 wf7 = wf3.LJLJI;
                marginLayoutParams.height = wf7.LJLLI;
                marginLayoutParams.width = wf7.LJLLJ.LIZLLL;
                wf3.LJLIL.setLayoutParams(marginLayoutParams);
                wf3.LJLIL.setImageBitmap(null);
                wf3.LJLIL.setBackgroundColor(wf3.LJLJI.LJLILLLLZI.getResources().getColor(R.color.eq));
                WF7 wf72 = wf3.LJLJI;
                if (wf72.LJLZ) {
                    wf3.LJLIL.setImageBitmap((Bitmap) ListProtector.get(wf72.LJLLLLLL, i2));
                    if (i2 != wf3.LJLJI.getItemCount() - 1) {
                        return;
                    }
                    wf3.L((Bitmap) ListProtector.get(wf3.LJLJI.LJLLLLLL, i2));
                    return;
                }
                WF6 wf6 = wf72.LJLJJL;
                if (wf6 == null) {
                    return;
                }
                wf6.LIZ(i2, "", 0, new InterfaceC45734HxC() { // from class: X.WF4
                    @Override // X.InterfaceC45734HxC
                    public final void LIZ(C81392Vwy c81392Vwy) {
                        WF3 wf32 = wf3;
                        boolean z = true;
                        if (i2 != wf32.LJLJI.getItemCount() - 1) {
                            z = false;
                        }
                        wf32.M(c81392Vwy, z);
                    }
                });
                return;
            }
            final WF3 wf32 = (WF3) viewHolder;
            wf32.LJLJI.LL();
            WF7 wf73 = wf32.LJLJI;
            for (int i4 = 0; i4 < ((ArrayList) wf73.LJLJJI).size(); i4++) {
                C15070iV c15070iV = (C15070iV) ((C15070iV) ListProtector.get(wf73.LJLJJI, i4)).LIZIZ;
                if (i2 >= ((Integer) c15070iV.LIZ).intValue() && i2 <= ((Integer) c15070iV.LIZIZ).intValue()) {
                    if (i4 < 0) {
                        return;
                    }
                    final C15070iV c15070iV2 = (C15070iV) ((C15070iV) ListProtector.get(wf32.LJLJI.LJLJJI, i4)).LIZIZ;
                    if (wf32.LJLJI.LJLIL == 1) {
                        float intValue = i2 - ((Integer) c15070iV2.LIZ).intValue();
                        WF7 wf74 = wf32.LJLJI;
                        min = Math.min((wf74.LJLJI.get(((VideoSegment) ListProtector.get(wf74.LJLJJLL, i4)).LJII(true)).floatValue() * intValue) + ((float) ((VideoSegment) ListProtector.get(wf32.LJLJI.LJLJJLL, i4)).LJIIIZ()), (float) ((VideoSegment) ListProtector.get(wf32.LJLJI.LJLJJLL, i4)).LJ());
                    } else {
                        float intValue2 = i2 - ((Integer) c15070iV2.LIZ).intValue();
                        WF7 wf75 = wf32.LJLJI;
                        min = Math.min(wf75.LJLJI.get(((VideoSegment) ListProtector.get(wf75.LJLJJLL, i4)).LJII(true)).floatValue() * intValue2, (float) ((VideoSegment) ListProtector.get(wf32.LJLJI.LJLJJLL, i4)).duration);
                    }
                    int i5 = (int) min;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(i4);
                    LIZ.append("-");
                    LIZ.append(i5);
                    final String LIZIZ = X1D.LIZIZ(LIZ);
                    wf32.LJLIL.setTag(LIZIZ);
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) wf32.LJLIL.getLayoutParams();
                    WF7 wf76 = wf32.LJLJI;
                    marginLayoutParams2.height = wf76.LJLLI;
                    marginLayoutParams2.width = wf76.LJLL;
                    if (i2 == ((Integer) c15070iV2.LIZIZ).intValue()) {
                        WF7 wf77 = wf32.LJLJI;
                        if (wf77.LJLIL == 1) {
                            f = (float) (((VideoSegment) ListProtector.get(wf77.LJLJJLL, i4)).LJ() - ((VideoSegment) ListProtector.get(wf32.LJLJI.LJLJJLL, i4)).LJIIIZ());
                            WF7 wf78 = wf32.LJLJI;
                            floatValue = wf78.LJLJI.get(((VideoSegment) ListProtector.get(wf78.LJLJJLL, i4)).LJII(true)).floatValue();
                        } else {
                            f = (float) ((VideoSegment) ListProtector.get(wf77.LJLJJLL, i4)).duration;
                            WF7 wf79 = wf32.LJLJI;
                            floatValue = wf79.LJLJI.get(((VideoSegment) ListProtector.get(wf79.LJLJJLL, i4)).LJII(true)).floatValue();
                        }
                        float f2 = f % floatValue;
                        WF7 wf710 = wf32.LJLJI;
                        marginLayoutParams2.width = (int) ((f2 / wf710.LJLJI.get(((VideoSegment) ListProtector.get(wf710.LJLJJLL, i4)).LJII(true)).floatValue()) * wf32.LJLJI.LJLL);
                    }
                    wf32.LJLIL.setLayoutParams(marginLayoutParams2);
                    wf32.LJLIL.setImageBitmap(null);
                    wf32.LJLIL.setBackgroundColor(wf32.LJLJI.LJLILLLLZI.getResources().getColor(R.color.eq));
                    WF7 wf711 = wf32.LJLJI;
                    if (wf711.LJLZ) {
                        wf32.LJLIL.setImageBitmap((Bitmap) ListProtector.get(wf711.LJLLLLLL, i2));
                        return;
                    }
                    final String LJII = ((VideoSegment) ListProtector.get(wf711.LJLJJLL, i4)).LJII(false);
                    WF7 wf712 = wf32.LJLJI;
                    WF6 wf62 = wf712.LJLJJL;
                    if (wf62 == null) {
                        return;
                    }
                    String LJII2 = ((VideoSegment) ListProtector.get(wf712.LJLJJLL, i4)).LJII(true);
                    for (int i6 = 0; i6 < wf32.LJLJI.LJLJL.size() && !LJII2.equals(((VideoSegment) ListProtector.get(wf32.LJLJI.LJLJL, i6)).LJII(true)); i6++) {
                    }
                    wf62.LIZ(i2, LJII, i5, new InterfaceC45734HxC() { // from class: X.WF5
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.InterfaceC45734HxC
                        public final void LIZ(C81392Vwy c81392Vwy) {
                            WF3 wf33 = WF3.this;
                            WF3 wf34 = wf32;
                            String str = LIZIZ;
                            int i7 = i2;
                            C15070iV c15070iV3 = c15070iV2;
                            String str2 = LJII;
                            wf33.getClass();
                            ImageView imageView = wf34.LJLIL;
                            if (imageView != null && imageView.getTag().equals(str)) {
                                wf33.M(c81392Vwy, false);
                            }
                            if (i7 == ((Integer) c15070iV3.LIZIZ).intValue()) {
                                wf33.LJLJI.LJLJJL.LIZJ(str2);
                            }
                        }
                    });
                    return;
                }
            }
        }
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        WF3 wf3 = new WF3(this, viewGroup);
        C0AX.LIZ(viewGroup, wf3.itemView, R.id.lj7);
        View view = wf3.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (wf3.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(WF3.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) wf3.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(wf3.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = WF3.class.getName();
        return wf3;
    }
}
