package X;

import Y.AObserverS70S0100000_2;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.creative.model.InitialMobParams;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.MagicFragment;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.VideoEffectFragment;
import com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider;
import com.ss.ugc.android.editor.components.base.api.IConsoleBarService;
import com.ss.ugc.android.editor.components.base.api.IFunctionBarService;
import com.ss.ugc.android.editor.components.base.api.IPreviewService;
import com.ss.ugc.android.editor.components.base.api.ITrackService;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.IDqS427S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.51W, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C51W extends AbstractC29891Fh<InterfaceC1294756h> implements InterfaceC1294756h, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLF;
    public final EditorProScene LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final InterfaceC1294756h LJLJI;
    public C132045Ge LJLJJI;
    public C51Z LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public IFunctionBarService LJLJLLL;
    public C50Q LJLL;
    public C1284452i LJLLI;
    public C1282051k LJLLILLLL;
    public String LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public long LJLLLLLL;
    public String LJLZ;
    public final C5H3 LJZ;
    public final C5H3 LJZI;
    public final InterfaceC1281251c LJZL;
    public boolean LL;
    public boolean LLD;

    static {
        TBT tbt = new TBT(C51W.class, "trackPanelApi", "getTrackPanelApi()Lcom/ss/ugc/android/editor/track/TrackPanelApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLF = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C51W.class, "previewPanelApi", "getPreviewPanelApi()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C51W.class, "consoleBarApi", "getConsoleBarApi()Lcom/ss/ugc/android/editor/components/base/console/ConsoleBarApiComponent;", 0, c65351Pkp)};
    }

    private final C51E LJJLIIIJLLLLLLLZ() {
        return (C51E) this.LJLJJLL.LIZ(this, LLF[0]);
    }

    private final void LJJLJLI() {
        LiveState<C08630Vn<C52V>> U30;
        C51M.LIZ = this.LJZL;
        boolean z = false;
        if (C00F.LIZ(31744, 0, "editor_pro_black_frame_optimization", true) != 3) {
            z = true;
        }
        C51M.LIZIZ = z;
        MutableLiveData LJII = C79057V0z.LJII(LJJLIIIJJI(), "panel_bounce_event");
        if (LJII != null) {
            LJII.observe(this, new AObserverS70S0100000_2(this, 164));
        }
        C52T LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ != null && (U30 = LJJLIIIIJ.U30()) != null) {
            LiveState.LJIIIZ(U30, this, new AqS168S0100000_2(this, 335));
        }
    }

    public final C52T LJJLIIIIJ() {
        return (C52T) this.LJLJLJ.LIZ(this, LLF[2]);
    }

    public final VideoPublishEditModel LJJLIIIJILLIZJL() {
        return this.LJLIL.getEditModel();
    }

    public final EditorProContext LJJLIIIJJI() {
        return (EditorProContext) this.LJZI.getValue();
    }

    public final InterfaceC1278950f LJJLIIIJJIZ() {
        return (InterfaceC1278950f) this.LJLJL.LIZ(this, LLF[1]);
    }

    public final void LJLIIL() {
        C126474xn c126474xn = new C126474xn();
        c126474xn.LJLJLLL = this.LJLLL;
        InterfaceC1278950f LJJLIIIJJIZ = LJJLIIIJJIZ();
        if (LJJLIIIJJIZ != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("video_material", c126474xn);
            C132005Ga textMaterial = this.LJLIL.getTextMaterial();
            if (textMaterial != null) {
                hashMap.put("text_sticker_material", textMaterial);
            }
            LJJLIIIJJIZ.Of(hashMap);
            LJJLIIIJJIZ.wr(LJJLIIIJJI().getNleSession());
        }
    }

    @Override // X.InterfaceC1294756h
    public void MV() {
        EditorProScene editorProScene;
        NavigationScene LJIIJJI;
        if (((Boolean) C147555qh.LIZ.getValue()).booleanValue() && !this.LLD && (editorProScene = this.LJLIL) != null && (LJIIJJI = C78923UyF.LJIIJJI(editorProScene)) != null) {
            LJJZZI(LJIIJJI);
            this.LLD = true;
        }
    }

    public final ActivityC45651qj getActivity() {
        return (ActivityC45651qj) this.LJZ.getValue();
    }

    private final String LJJLIIJ() {
        return C60903NvH.LJIIJJI().LJJIJL().getFileProvider().LIZ();
    }

    private final void LJJLJ() {
        ITrackService LIZJ = C127834zz.LIZJ();
        if (LIZJ != null) {
            LIZJ.init(LJJLIIIJLLLLLLLZ());
        }
        IConsoleBarService iConsoleBarService = (IConsoleBarService) C171096nZ.LIZ(IConsoleBarService.class);
        if (iConsoleBarService != null) {
            iConsoleBarService.init(LJJLIIIIJ());
        }
        LJJLL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        if (X.C126784yI.LIZ().isMultiRecord() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void LJJLL() {
        /*
            r5 = this;
            com.ss.ugc.android.editor.core.EditorProContext r0 = r5.LJJLIIIJJI()
            com.bytedance.ies.nle.editor_jni.NLEModel r2 = X.C79057V0z.LJJI(r0)
            java.lang.String r1 = "model_extra_is_multi_record_when_first_init"
            boolean r0 = r2.hasExtra(r1)
            r3 = 0
            if (r0 == 0) goto L4e
            java.lang.String r0 = r2.getExtra(r1)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 == 0) goto L4e
        L1c:
            r3 = 1
        L1d:
            X.4zQ r1 = X.EnumC127484zQ.ENABLE_EFFECT
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Object r0 = X.C5BA.LIZ(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
            X.51k r1 = new X.51k
            X.1qj r0 = r5.getActivity()
            r1.<init>(r0, r3, r2)
            boolean r0 = r5.LJLLL
            r1.LJ = r0
            r5.LJLLILLLL = r1
            com.ss.ugc.android.editor.components.base.api.IFunctionBarService r4 = r5.LJLJLLL
            if (r4 == 0) goto L4d
            X.1qj r3 = r5.getActivity()
            X.51k r2 = r5.LJLLILLLL
            r1 = 2131365901(0x7f0a100d, float:1.835168E38)
            r0 = 2131365902(0x7f0a100e, float:1.8351682E38)
            r4.init(r3, r2, r1, r0)
        L4d:
            return
        L4e:
            X.4yI r0 = com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider.Companion
            r0.getClass()
            com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider r0 = X.C126784yI.LIZ()
            boolean r0 = r0.isMultiRecord()
            if (r0 == 0) goto L1d
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51W.LJJLL():void");
    }

    private final void LJJZZIII() {
        C1284452i multiTrackController;
        C58D jB = jB();
        C1284452i c1284452i = null;
        if (jB != null) {
            jB.setMobEvent(new InterfaceC1281151b() { // from class: X.51V
                @Override // X.InterfaceC1281151b
                public final void LIZ() {
                    VideoPublishEditModel LJJLIIIJILLIZJL = C51W.this.LJJLIIIJILLIZJL();
                    if (LJJLIIIJILLIZJL != null) {
                        FMX.LJIIL("edit_black_screen_toast", C5QW.LJII(LJJLIIIJILLIZJL).LIZ);
                    }
                }
            });
            jB.setOnClickNullAudioTrack(new AqS168S0100000_2(this, 336));
            jB.setOnClickNullEffectTrack(new AqS168S0100000_2(this, 337));
            jB.setOnShouldInterceptSlotClickEvent(new IDqS427S0100000_2(this, 2));
            jB.setSubTrackPadding(6);
            jB.hideCoverGroup();
            jB.setTimeLinePainter(new C55M() { // from class: X.59i
                public final Paint LIZ;
                public final float LIZIZ;

                {
                    float f;
                    Paint paint = new Paint(1);
                    this.LIZ = paint;
                    if (C5CK.LIZIZ()) {
                        f = 12.0f;
                    } else {
                        f = 10.0f;
                    }
                    float LIZ = C134845Qy.LIZ(f);
                    paint.setColor(-1);
                    paint.setTextSize(LIZ);
                    paint.setAlpha(128);
                    paint.setTypeface(C8HI.LIZJ().LIZLLL("regular"));
                    this.LIZIZ = (paint.descent() + paint.ascent()) / 2;
                }

                @Override // X.C55M
                public final void LIZ(Canvas canvas, int i, float f, float f2, float f3) {
                    String valueOf;
                    String valueOf2;
                    o.LJIIIZ(canvas, "canvas");
                    if (i % 2 == 0) {
                        int i2 = (int) f3;
                        int LJJIIZ = O6R.LJJIIZ((f3 - i2) / 0.033333335f);
                        if (LJJIIZ == 0) {
                            int i3 = i2 / 60;
                            int i4 = i2 % 60;
                            if (i3 < 10) {
                                valueOf = C169696lJ.LIZIZ('0', i3);
                            } else {
                                valueOf = String.valueOf(i3);
                            }
                            if (i4 < 10) {
                                valueOf2 = C169696lJ.LIZIZ('0', i4);
                            } else {
                                valueOf2 = String.valueOf(i4);
                            }
                            String LIZIZ = C00F.LIZIZ(valueOf, ':', valueOf2);
                            canvas.drawText(LIZIZ, f - (this.LIZ.measureText(LIZIZ) / 2), f2 - this.LIZIZ, this.LIZ);
                            return;
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(LJJIIZ);
                        LIZ.append('f');
                        String LIZIZ2 = X1D.LIZIZ(LIZ);
                        canvas.drawText(LIZIZ2, f - (this.LIZ.measureText(LIZIZ2) / 2), f2 - this.LIZIZ, this.LIZ);
                    }
                }
            });
            jB.setAudioSoulPainter(new C130725Bc(getActivity()));
            final ActivityC45651qj activity = getActivity();
            jB.setTrackSlotLabelPainter(new C5AI(activity) { // from class: X.5A9
                public final C5A8 LIZ;
                public final C5B3 LIZIZ;
                public final C130505Ag LIZJ;
                public final C130515Ah LIZLLL;
                public final C62822Ol8 LJ;

                {
                    o.LJIIIZ(activity, "activity");
                    this.LIZ = new C5A8(activity);
                    this.LIZIZ = new C5B3(activity);
                    this.LIZJ = new C130505Ag(activity);
                    this.LIZLLL = new C130515Ah(activity);
                    this.LJ = C221108m2.LIZIZ(C51Y.LJLIL);
                }

                @Override // X.C5AI
                public final void LIZ(C5BC trackItemView, NLETrackSlot nLETrackSlot, RectF drawRect, Canvas canvas, int i, long j) {
                    o.LJIIIZ(trackItemView, "trackItemView");
                    o.LJIIIZ(drawRect, "drawRect");
                    o.LJIIIZ(canvas, "canvas");
                    NLETrack trackBySlot = C79057V0z.LJJI((EditorProContext) this.LJ.getValue()).getTrackBySlot(nLETrackSlot);
                    if (trackBySlot != null && !trackBySlot.LJIIJ()) {
                        if (C124574uj.LJJJJJL(trackBySlot)) {
                            this.LIZ.LIZ(trackItemView, nLETrackSlot, drawRect, canvas, i, j);
                            return;
                        }
                        if (C124574uj.LJJIJLIJ(trackBySlot)) {
                            this.LIZIZ.LIZ(trackItemView, nLETrackSlot, drawRect, canvas, i, 0L);
                        } else if (C124574uj.LJJJLIIL(trackBySlot)) {
                            this.LIZJ.LIZ(trackItemView, nLETrackSlot, drawRect, canvas, i, 0L);
                        } else if (C124574uj.LJJJIL(trackBySlot)) {
                            this.LIZLLL.LIZ(trackItemView, nLETrackSlot, drawRect, canvas, i, 0L);
                        }
                    }
                }
            });
            C58D.setPlayHeadWidth$default(jB, AnonymousClass564.LIZIZ(2.0f), 0.0f, 2, null);
            final ActivityC45651qj activity2 = getActivity();
            jB.setNullAudioTrackPainter(new InterfaceC130955Bz(activity2) { // from class: X.5B6
                public final boolean LIZ;
                public final Paint LIZIZ;
                public final TextPaint LIZJ;
                public final float LIZLLL;
                public final SY9 LJ;
                public final String LJFF;
                public final int LJI;
                public final int LJII;
                public final int LJIIIIZZ;
                public final int LJIIIZ;
                public final int LJIIJ;
                public final int LJIIJJI;
                public final boolean LJIIL;

                {
                    float LIZ;
                    float f;
                    float f2;
                    float f3;
                    Paint.Style style;
                    o.LJIIIZ(activity2, "context");
                    boolean LIZIZ = C90193gN.LIZIZ(activity2);
                    this.LIZ = LIZIZ;
                    Paint paint = new Paint();
                    this.LIZIZ = paint;
                    TextPaint textPaint = new TextPaint();
                    if (LIZIZ) {
                        textPaint.setTextAlign(Paint.Align.RIGHT);
                    }
                    this.LIZJ = textPaint;
                    if (C58B.LIZ()) {
                        LIZ = C32151Nz.LJIIZILJ(6);
                    } else {
                        LIZ = C134845Qy.LIZ(2.0f);
                    }
                    this.LIZLLL = LIZ;
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_music_note_s_alt;
                    c2068389v.LJ = Integer.valueOf(R.attr.dj);
                    c2068389v.LJFF = true;
                    this.LJ = c2068389v.LIZ(activity2);
                    String string = activity2.getString(R.string.fmx);
                    o.LJIIIIZZ(string, "context.getString(R.stri…ditor_pro_menu_sound_add)");
                    this.LJFF = string;
                    Rect rect = new Rect();
                    int LIZ2 = C134845Qy.LIZ(8.0f);
                    this.LJI = LIZ2;
                    float f4 = 9.0f;
                    if (C5CK.LIZIZ()) {
                        f = 9.0f;
                    } else if (C5CK.LIZJ()) {
                        f = 10.0f;
                    } else {
                        f = 8.0f;
                    }
                    this.LJII = C134845Qy.LIZ(f);
                    int LIZ3 = C134845Qy.LIZ(4.0f);
                    this.LJIIIIZZ = LIZ3;
                    if (C5CK.LIZIZ()) {
                        f4 = 8.0f;
                    } else if (!C5CK.LIZJ()) {
                        f4 = 7.0f;
                    }
                    this.LJIIIZ = C134845Qy.LIZ(f4);
                    if (C5CK.LIZIZ()) {
                        f2 = 16.0f;
                    } else {
                        f2 = 12.0f;
                    }
                    int LIZ4 = C134845Qy.LIZ(f2);
                    this.LJIIJ = LIZ4;
                    int LIZ5 = C134845Qy.LIZ(8.0f);
                    this.LJIIL = C133005Jw.LIZ();
                    paint.setAntiAlias(true);
                    paint.setColor(activity2.getResources().getColor(R.color.b1));
                    textPaint.setAntiAlias(true);
                    if (C5CK.LIZIZ()) {
                        f3 = 14.0f;
                    } else {
                        f3 = 11.0f;
                    }
                    textPaint.setTextSize(C134845Qy.LIZ(f3));
                    textPaint.setStrokeWidth(1.0f);
                    if (C5CK.LIZIZ()) {
                        style = Paint.Style.FILL_AND_STROKE;
                    } else {
                        style = Paint.Style.FILL;
                    }
                    textPaint.setStyle(style);
                    textPaint.setColor(activity2.getResources().getColor(R.color.bc));
                    textPaint.setTypeface(C8HI.LIZJ().LIZLLL("regular"));
                    textPaint.getTextBounds(string, 0, string.length(), rect);
                    this.LJIIJJI = rect.width() + LIZ2 + LIZ4 + LIZ3 + LIZ5;
                }

                @Override // X.InterfaceC130955Bz
                public final void LIZ(Canvas canvas, float f, float f2, float f3, float f4) {
                    float f5;
                    float f6;
                    o.LJIIIZ(canvas, "canvas");
                    SY9 sy9 = this.LJ;
                    if (sy9 != null) {
                        if (this.LIZ) {
                            int i = ((int) f3) - this.LJI;
                            int i2 = this.LJIIJ;
                            int i3 = ((int) f2) + this.LJII;
                            sy9.setBounds(i - i2, i3, i, i2 + i3);
                        } else {
                            int i4 = ((int) f) + this.LJI;
                            int i5 = ((int) f2) + this.LJII;
                            int i6 = this.LJIIJ;
                            sy9.setBounds(i4, i5, i4 + i6, i6 + i5);
                        }
                        sy9.draw(canvas);
                        if (this.LIZ) {
                            canvas.drawText(this.LJFF, ((f3 - this.LJI) - this.LJIIJ) - this.LJIIIIZZ, this.LIZJ.getTextSize() + this.LJIIIZ + f2, this.LIZJ);
                        } else {
                            canvas.drawText(this.LJFF, this.LJI + f + this.LJIIJ + this.LJIIIIZZ, this.LIZJ.getTextSize() + this.LJIIIZ + f2, this.LIZJ);
                        }
                    }
                    if (this.LIZ) {
                        float max = f3 - Math.max(f3 - f, this.LJIIJJI);
                        if (this.LJIIL) {
                            f6 = C143205jg.LJ() - C1303859u.LLJJI;
                        } else {
                            f6 = f3;
                        }
                        if (this.LJIIL && f <= f3 - (C143205jg.LJ() / 2)) {
                            RectF rectF = new RectF(max, f2, f6, f4);
                            Path path = new Path();
                            path.moveTo(rectF.left, rectF.top);
                            path.lineTo(rectF.right - this.LIZLLL, rectF.top);
                            float f7 = rectF.right;
                            float f8 = 2;
                            float f9 = this.LIZLLL * f8;
                            float f10 = rectF.top;
                            path.arcTo(new RectF(f7 - f9, f10, f7, f9 + f10), -90.0f, 90.0f);
                            path.lineTo(rectF.right, rectF.bottom - this.LIZLLL);
                            float f11 = rectF.right;
                            float f12 = f8 * this.LIZLLL;
                            float f13 = rectF.bottom;
                            path.arcTo(new RectF(f11 - f12, f13 - f12, f11, f13), 0.0f, 90.0f);
                            path.lineTo(rectF.left, rectF.bottom);
                            path.close();
                            canvas.drawPath(path, this.LIZIZ);
                            return;
                        }
                        float f14 = this.LIZLLL;
                        canvas.drawRoundRect(max, f2, f6, f4, f14, f14, this.LIZIZ);
                        return;
                    }
                    if (this.LJIIL) {
                        f5 = C1303859u.LLJJI;
                    } else {
                        f5 = f;
                    }
                    float max2 = Math.max(f3 - f, this.LJIIJJI) + f;
                    if (this.LJIIL && f3 >= f + (C143205jg.LJ() / 2)) {
                        RectF rectF2 = new RectF(f5, f2, max2, f4);
                        Path path2 = new Path();
                        path2.moveTo(rectF2.left + this.LIZLLL, rectF2.top);
                        path2.lineTo(rectF2.right, rectF2.top);
                        path2.lineTo(rectF2.right, rectF2.bottom);
                        path2.lineTo(rectF2.left + this.LIZLLL, rectF2.bottom);
                        float f15 = rectF2.left;
                        float f16 = rectF2.bottom;
                        float f17 = 2;
                        float f18 = this.LIZLLL * f17;
                        path2.arcTo(new RectF(f15, f16 - f18, f18 + f15, f16), 90.0f, 90.0f, false);
                        path2.lineTo(rectF2.left, rectF2.top + this.LIZLLL);
                        float f19 = rectF2.left;
                        float f20 = rectF2.top;
                        float f21 = this.LIZLLL * f17;
                        path2.arcTo(new RectF(f19, f20, f21 + f19, f21 + f20), 180.0f, 90.0f, false);
                        path2.close();
                        canvas.drawPath(path2, this.LIZIZ);
                        return;
                    }
                    float f22 = this.LIZLLL;
                    canvas.drawRoundRect(f5, f2, max2, f4, f22, f22, this.LIZIZ);
                }
            });
            final ActivityC45651qj activity3 = getActivity();
            jB.setNullEffectTrackPainter(new InterfaceC130955Bz(activity3) { // from class: X.5B5
                public final boolean LIZ;
                public final Paint LIZIZ;
                public final TextPaint LIZJ;
                public final float LIZLLL;
                public final SY9 LJ;
                public final String LJFF;
                public final int LJI;
                public final int LJII;
                public final int LJIIIIZZ;
                public final int LJIIIZ;
                public final int LJIIJ;
                public final int LJIIJJI;

                {
                    float LIZ;
                    float f;
                    float f2;
                    float f3;
                    Paint.Style style;
                    o.LJIIIZ(activity3, "context");
                    boolean LIZIZ = C90193gN.LIZIZ(activity3);
                    this.LIZ = LIZIZ;
                    Paint paint = new Paint();
                    this.LIZIZ = paint;
                    TextPaint textPaint = new TextPaint();
                    if (LIZIZ) {
                        textPaint.setTextAlign(Paint.Align.RIGHT);
                    }
                    this.LIZJ = textPaint;
                    if (C58B.LIZ()) {
                        LIZ = C32151Nz.LJIIZILJ(6);
                    } else {
                        LIZ = C134845Qy.LIZ(2.0f);
                    }
                    this.LIZLLL = LIZ;
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_effect_rectangle_alt_fill;
                    c2068389v.LJ = Integer.valueOf(R.attr.dj);
                    c2068389v.LJFF = true;
                    this.LJ = c2068389v.LIZ(activity3);
                    String string = activity3.getString(R.string.fle);
                    o.LJIIIIZZ(string, "context.getString(R.string.editeffect_title)");
                    this.LJFF = string;
                    Rect rect = new Rect();
                    int LIZ2 = C134845Qy.LIZ(8.0f);
                    this.LJI = LIZ2;
                    float f4 = 9.0f;
                    if (C5CK.LIZIZ()) {
                        f = 9.0f;
                    } else if (C5CK.LIZJ()) {
                        f = 10.0f;
                    } else {
                        f = 8.0f;
                    }
                    this.LJII = C134845Qy.LIZ(f);
                    int LIZ3 = C134845Qy.LIZ(4.0f);
                    this.LJIIIIZZ = LIZ3;
                    if (C5CK.LIZIZ()) {
                        f4 = 8.0f;
                    } else if (!C5CK.LIZJ()) {
                        f4 = 7.0f;
                    }
                    this.LJIIIZ = C134845Qy.LIZ(f4);
                    if (C5CK.LIZIZ()) {
                        f2 = 16.0f;
                    } else {
                        f2 = 12.0f;
                    }
                    int LIZ4 = C134845Qy.LIZ(f2);
                    this.LJIIJ = LIZ4;
                    int LIZ5 = C134845Qy.LIZ(8.0f);
                    paint.setAntiAlias(true);
                    paint.setColor(activity3.getResources().getColor(R.color.b1));
                    textPaint.setAntiAlias(true);
                    if (C5CK.LIZIZ()) {
                        f3 = 14.0f;
                    } else {
                        f3 = 11.0f;
                    }
                    textPaint.setTextSize(C134845Qy.LIZ(f3));
                    textPaint.setStrokeWidth(1.0f);
                    if (C5CK.LIZIZ()) {
                        style = Paint.Style.FILL_AND_STROKE;
                    } else {
                        style = Paint.Style.FILL;
                    }
                    textPaint.setStyle(style);
                    textPaint.setColor(activity3.getResources().getColor(R.color.bc));
                    textPaint.setTypeface(C8HI.LIZJ().LIZLLL("regular"));
                    textPaint.getTextBounds(string, 0, string.length(), rect);
                    this.LJIIJJI = rect.width() + LIZ2 + LIZ4 + LIZ3 + LIZ5;
                }

                @Override // X.InterfaceC130955Bz
                public final void LIZ(Canvas canvas, float f, float f2, float f3, float f4) {
                    o.LJIIIZ(canvas, "canvas");
                    SY9 sy9 = this.LJ;
                    if (sy9 != null) {
                        if (this.LIZ) {
                            int i = ((int) f3) - this.LJI;
                            int i2 = this.LJIIJ;
                            int i3 = ((int) f2) + this.LJII;
                            sy9.setBounds(i - i2, i3, i, i2 + i3);
                        } else {
                            int i4 = ((int) f) + this.LJI;
                            int i5 = ((int) f2) + this.LJII;
                            int i6 = this.LJIIJ;
                            sy9.setBounds(i4, i5, i4 + i6, i6 + i5);
                        }
                        sy9.draw(canvas);
                        if (this.LIZ) {
                            canvas.drawText(this.LJFF, ((f3 - this.LJI) - this.LJIIJ) - this.LJIIIIZZ, this.LIZJ.getTextSize() + this.LJIIIZ + f2, this.LIZJ);
                        } else {
                            canvas.drawText(this.LJFF, this.LJI + f + this.LJIIJ + this.LJIIIIZZ, this.LIZJ.getTextSize() + this.LJIIIZ + f2, this.LIZJ);
                        }
                    }
                    if (this.LIZ) {
                        float max = f3 - Math.max(f3 - f, this.LJIIJJI);
                        float f5 = this.LIZLLL;
                        canvas.drawRoundRect(max, f2, f3, f4, f5, f5, this.LIZIZ);
                    } else {
                        float max2 = Math.max(f3 - f, this.LJIIJJI) + f;
                        float f6 = this.LIZLLL;
                        canvas.drawRoundRect(f, f2, max2, f4, f6, f6, this.LIZIZ);
                    }
                }
            });
            jB.setAudioCollectionLabelPainter(new C5AM(getActivity()));
            jB.setAudioCollectionWaveCalStrategy(C51Q.LJLIL);
            jB.setAudioCollectionLabelPainter(new C5AM(getActivity()));
            jB.setTrackDragEventListener(new C5AH() { // from class: X.51J
                @Override // X.C5AH
                public final void LIZLLL() {
                    C58D jB2 = C51W.this.jB();
                    if (jB2 != null) {
                        jB2.setDragOnVerticalAbility(true);
                    }
                }

                @Override // X.C5AH
                public final void LIZJ(NLETrackSlot nLETrackSlot) {
                    boolean z;
                    String extra;
                    VideoPublishEditModel LJJLIIIJILLIZJL;
                    String extra2;
                    NLETrack trackBySlot = C79057V0z.LJJI(C51W.this.LJJLIIIJJI()).getTrackBySlot(nLETrackSlot);
                    if (nLETrackSlot != null && AnonymousClass636.LJIIL(nLETrackSlot)) {
                        C58D jB2 = C51W.this.jB();
                        if (jB2 != null) {
                            jB2.setDragOnVerticalAbility(false);
                            return;
                        }
                        return;
                    }
                    if (trackBySlot != null && C124574uj.LJJJ(trackBySlot)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = "";
                    if (!z) {
                        if (trackBySlot != null) {
                            if (!C124574uj.LJJIL(trackBySlot)) {
                                if (C124574uj.LJJJJLL(trackBySlot) && (LJJLIIIJILLIZJL = C51W.this.LJJLIIIJILLIZJL()) != null) {
                                    EditorProContext LJJLIIIJJI = C51W.this.LJJLIIIJJI();
                                    if (nLETrackSlot != null && (extra2 = nLETrackSlot.getExtra("slot_extra_music_id")) != null) {
                                        str = extra2;
                                    }
                                    C5QW.LJJIIZ(LJJLIIIJILLIZJL, LJJLIIIJJI, str, false);
                                }
                            }
                        }
                        C58D jB3 = C51W.this.jB();
                        if (jB3 == null) {
                            return;
                        }
                        jB3.setDragOnVerticalAbility(true);
                        return;
                    }
                    VideoPublishEditModel LJJLIIIJILLIZJL2 = C51W.this.LJJLIIIJILLIZJL();
                    if (LJJLIIIJILLIZJL2 != null) {
                        EditorProContext LJJLIIIJJI2 = C51W.this.LJJLIIIJJI();
                        if (nLETrackSlot != null && (extra = nLETrackSlot.getExtra("slot_extra_music_id")) != null) {
                            str = extra;
                        }
                        C5QW.LJJIIZ(LJJLIIIJILLIZJL2, LJJLIIIJJI2, str, true);
                    }
                    C58D jB4 = C51W.this.jB();
                    if (jB4 == null) {
                        return;
                    }
                    jB4.setDragOnVerticalAbility(false);
                }

                @Override // X.C5AH
                public final boolean LIZIZ(NLETrackSlot nLETrackSlot, int i) {
                    if (nLETrackSlot != null) {
                        C51W c51w = C51W.this;
                        if (C124604um.LJII(nLETrackSlot, c51w.LJJLIIIJJI()) && (!((ArrayList) C32151Nz.LJIJJLI(c51w.LJJLIIIJJI())).isEmpty()) && i == 0) {
                            return false;
                        }
                        if (AnonymousClass636.LJIILL(nLETrackSlot) && i == 0 && C5FC.LJIIIZ(C79057V0z.LJJI(c51w.LJJLIIIJJI()))) {
                            return false;
                        }
                    }
                    return true;
                }

                @Override // X.C5AH
                public final boolean LJ(NLETrackSlot nLETrackSlot, int i) {
                    int i2;
                    if (nLETrackSlot != null) {
                        C51W c51w = C51W.this;
                        if (C124604um.LJII(nLETrackSlot, c51w.LJJLIIIJJI()) && (!((ArrayList) C32151Nz.LJIJJLI(c51w.LJJLIIIJJI())).isEmpty()) && i == 0) {
                            return false;
                        }
                        if (AnonymousClass636.LJIILL(nLETrackSlot) && i == 0 && C5FC.LJIIIZ(C79057V0z.LJJI(c51w.LJJLIIIJJI()))) {
                            return false;
                        }
                        if (C124574uj.LJJJI(nLETrackSlot)) {
                            NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) ORZ.LLFII(C124574uj.LJIILIIL(C79057V0z.LJJI(c51w.LJJLIIIJJI())));
                            if (nLETimeSpaceNode != null) {
                                i2 = nLETimeSpaceNode.getLayer();
                            } else {
                                i2 = -1;
                            }
                            if (i2 + 1 >= C123254sb.LIZ) {
                                return false;
                            }
                        }
                    }
                    return true;
                }

                @Override // X.C5AH
                public final C51K LIZ(NLETrackSlot nLETrackSlot, int i, boolean z) {
                    int i2;
                    NLETrack nLETrack;
                    NLETrack nLETrack2;
                    if (nLETrackSlot != null) {
                        C51W c51w = C51W.this;
                        if (C124604um.LJII(nLETrackSlot, c51w.LJJLIIIJJI())) {
                            if ((!((ArrayList) C32151Nz.LJIJJLI(c51w.LJJLIIIJJI())).isEmpty()) && i == 0) {
                                return new C51K(true, false);
                            }
                            VecNLETrackSPtr tracks = C79057V0z.LJJI(c51w.LJJLIIIJJI()).getTracks();
                            o.LJIIIIZZ(tracks, "editorContext.getNLEModel().tracks");
                            Iterator<NLETrack> it = tracks.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    nLETrack2 = it.next();
                                    NLETrack track = nLETrack2;
                                    o.LJIIIIZZ(track, "track");
                                    if (C124574uj.LJJJJLI(true, track) && track.getLayer() == i) {
                                        break;
                                    }
                                } else {
                                    nLETrack2 = null;
                                    break;
                                }
                            }
                            NLETrack nLETrack3 = nLETrack2;
                            if (nLETrack3 != null && !o.LJ(nLETrack3.getExtra("AudioTrackType"), "SOUND_EFFECT")) {
                                if (z) {
                                    return new C51K();
                                }
                                if (nLETrack3.LJIILL().isEmpty()) {
                                    nLETrack3.setExtra("AudioTrackType", "SOUND_EFFECT");
                                    return new C51K();
                                }
                                return new C51K(true, false);
                            }
                        }
                        if (C124604um.LJI(nLETrackSlot, c51w.LJJLIIIJJI()) && i != 0) {
                            return new C51K(true, false);
                        }
                        if (C124604um.LJ(nLETrackSlot)) {
                            if ((!((ArrayList) C32151Nz.LJIJJLI(c51w.LJJLIIIJJI())).isEmpty()) && i == 0) {
                                return new C51K(true, false);
                            }
                            VecNLETrackSPtr tracks2 = C79057V0z.LJJI(c51w.LJJLIIIJJI()).getTracks();
                            o.LJIIIIZZ(tracks2, "editorContext.getNLEModel().tracks");
                            Iterator<NLETrack> it2 = tracks2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    nLETrack = it2.next();
                                    NLETrack track2 = nLETrack;
                                    o.LJIIIIZZ(track2, "track");
                                    if (C124574uj.LJJJJLI(true, track2) && track2.getLayer() == i) {
                                        break;
                                    }
                                } else {
                                    nLETrack = null;
                                    break;
                                }
                            }
                            NLETrack nLETrack4 = nLETrack;
                            if (nLETrack4 != null && !o.LJ(nLETrack4.getExtra("AudioTrackType"), "AUDIO_RECORD")) {
                                if (z) {
                                    return new C51K();
                                }
                                if (nLETrack4.LJIILL().isEmpty()) {
                                    nLETrack4.setExtra("AudioTrackType", "AUDIO_RECORD");
                                    return new C51K();
                                }
                                return new C51K(true, false);
                            }
                        }
                        if (AnonymousClass636.LJIILL(nLETrackSlot) && i == 0 && C5FC.LJIIIZ(C79057V0z.LJJI(c51w.LJJLIIIJJI()))) {
                            return new C51K(true, false);
                        }
                        if (C124574uj.LJJJI(nLETrackSlot) && z) {
                            NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) ORZ.LLFII(C124574uj.LJIILIIL(C79057V0z.LJJI(c51w.LJJLIIIJJI())));
                            if (nLETimeSpaceNode != null) {
                                i2 = nLETimeSpaceNode.getLayer();
                            } else {
                                i2 = -1;
                            }
                            if (i2 + 1 >= C123254sb.LIZ) {
                                return new C51K(true, false);
                            }
                        }
                    }
                    return new C51K();
                }
            });
            jB.setAudioCollectionWaveCalStrategy(C51R.LJLIL);
            jB.setAudioCollectionClickListener(new AqS168S0100000_2(this, 338));
            if (C132575If.LIZ() && C5DH.LIZ()) {
                jB.setHorizontalFlingListener(new AqS133S0200000_2(this, jB, 76));
            }
            jB.setFingerUpAfterMovedListener(new AqS152S0100000_2(this, 586));
        }
        if (jB() != null) {
            C51E LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ();
            if (LJJLIIIJLLLLLLLZ != null && (multiTrackController = LJJLIIIJLLLLLLLZ.getMultiTrackController()) != null) {
                C51S filter = C51S.LJLIL;
                o.LJIIIZ(filter, "filter");
                multiTrackController.LJLILLLLZI.LLIZ = filter;
                boolean z = !this.LJLLL;
                multiTrackController.LJLIL.setEnableTinyScroller$editor_trackpanel_release(z);
                multiTrackController.LJLILLLLZI.LJLLLLLL = z;
                multiTrackController.LJLIL.setPipDropVisibility(z);
                boolean booleanValue = ((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_EFFECT, Boolean.FALSE)).booleanValue();
                multiTrackController.LJLIL.setEnableEffectTinyScroller$editor_trackpanel_release(booleanValue);
                multiTrackController.LJLILLLLZI.LJLZ = booleanValue;
                c1284452i = multiTrackController;
            }
            this.LJLLI = c1284452i;
        }
        if (this.LJLLL) {
            C58D jB2 = jB();
            if (jB2 != null) {
                jB2.enableMainTrackClickable(false);
            }
            C58D jB3 = jB();
            if (jB3 != null) {
                jB3.setMainTrackBtnVisibility(false);
            }
            C58D jB4 = jB();
            if (jB4 != null) {
                jB4.enableMainTrackShowTips(false);
            }
        }
    }

    public final void LJJLI() {
        if (o.LJ(C79057V0z.LJJ(LJJLIIIJJI()).LIZLLL().LIZ().getUUID(), this.LJLZ)) {
            C51P.LIZJ(LJJLIIIJJI(), LJJLIIIIJ(), 8);
        } else {
            C51P.LIZJ(LJJLIIIJJI(), LJJLIIIIJ(), 12);
        }
    }

    public final boolean Ps() {
        AnonymousClass516 anonymousClass516 = (AnonymousClass516) C79057V0z.LJJIIJ(LJJLIIIJJI(), "panel_bounce_event");
        if (anonymousClass516 == null || !anonymousClass516.LIZ) {
            return false;
        }
        return true;
    }

    public final C58D jB() {
        C51E LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ();
        if (LJJLIIIJLLLLLLLZ != null) {
            return LJJLIIIJLLLLLLLZ.jB();
        }
        return null;
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        C51M.LIZ = null;
    }

    @Override // X.InterfaceC1294756h
    public C1282051k Aq0() {
        return this.LJLLILLLL;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC1294756h getApiComponent() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC1294756h
    public boolean isInitialized() {
        return this.LL;
    }

    private final void LJJZZI(NavigationScene navigationScene) {
        C50Q c50q;
        C50Q c50q2;
        AnonymousClass525 LJI;
        VideoPublishEditModel LJJLIIIJILLIZJL;
        IFunctionBarService iFunctionBarService = this.LJLJLLL;
        if (iFunctionBarService != null && (c50q = iFunctionBarService.getFuncBarController()) != null) {
            C1281551f c1281551f = new C1281551f(this.LJLIL, navigationScene);
            this.LJLIL.initVideoLayout(c1281551f);
            c50q.LJIIIIZZ(c1281551f);
            c50q.LJIIIIZZ(new C1280850y(getActivity(), this.LJLIL.getActionMenuController()));
            C52G c52g = new C52G(getActivity(), this.LJLIL.getActionMenuController());
            this.LJLIL.initTextEditLayout(c52g);
            c50q.LJIIIIZZ(c52g);
            AnonymousClass509 anonymousClass509 = new AnonymousClass509(getActivity(), navigationScene);
            this.LJLIL.initPipLayout(anonymousClass509);
            c50q.LJIIIIZZ(anonymousClass509);
            final ActivityC45651qj activity = getActivity();
            c50q.LJIIIIZZ(new AbstractC1282851s(activity) { // from class: X.4yD
                public final ArrayList<String> LJ;
                public final ArrayList<String> LJFF;
                public final C62822Ol8 LJI;
                public final C62822Ol8 LJII;

                public static final VideoPublishEditModel LJFF() {
                    return C132805Jc.LIZIZ(EditModelProvider.Companion);
                }

                public final EditorProContext LJI() {
                    return (EditorProContext) this.LJI.getValue();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(activity);
                    o.LJIIIZ(activity, "activity");
                    this.LJ = C47261Igj.LJII("bottom_item_root_effects", "bottom_item_effect_add_effects", "bottom_item_effect_edit_replace_effect", "bottom_item_effect_edit_copy", "bottom_item_effect_edit_delete");
                    this.LJFF = C47261Igj.LJII("bottom_item_effect_edit_replace_effect", "bottom_item_effect_edit_copy", "bottom_item_effect_edit_delete");
                    this.LJI = C221108m2.LIZIZ(C123574t7.LJLIL);
                    this.LJII = C221108m2.LIZIZ(C126744yE.LJLIL);
                }

                @Override // X.C52A
                public final boolean LIZ(AnonymousClass523 funcItem) {
                    o.LJIIIZ(funcItem, "funcItem");
                    return this.LJ.contains(funcItem.LJ);
                }

                @Override // X.AbstractC1282851s, X.C52A
                public final boolean LIZLLL(AnonymousClass523 funcItem) {
                    o.LJIIIZ(funcItem, "funcItem");
                    if (AnonymousClass515.LIZ() && TextUtils.equals(funcItem.LJ, "bottom_item_root_effects")) {
                        return true;
                    }
                    return false;
                }

                @Override // X.C52A
                public final void LIZIZ(AnonymousClass523 funcItem, View view) {
                    long min;
                    EnumC126794yJ enumC126794yJ;
                    VideoPublishEditModel LJFF;
                    C125974wz LIZJ;
                    String str;
                    o.LJIIIZ(funcItem, "funcItem");
                    if (!funcItem.LJFF) {
                        return;
                    }
                    NLETrackSlot selectedTrackSlot = LJI().getSelectedTrackSlot();
                    if (this.LJFF.contains(funcItem.LJ)) {
                        if (selectedTrackSlot == null) {
                            String string = this.LIZ.getString(R.string.jue);
                            o.LJIIIIZZ(string, "activity.getString(R.string.please_select_slot)");
                            C132105Gk.LIZJ(string);
                            return;
                        } else if (!C124574uj.LJJJI(selectedTrackSlot)) {
                            return;
                        }
                    }
                    LJI().getPlayer().pause();
                    String str2 = funcItem.LJ;
                    OSZ osz = null;
                    r7 = null;
                    String str3 = null;
                    switch (str2.hashCode()) {
                        case -707543446:
                            if (!str2.equals("bottom_item_effect_edit_delete") || selectedTrackSlot == null) {
                                return;
                            }
                            C125154vf c125154vf = (C125154vf) this.LJII.getValue();
                            if (c125154vf != null) {
                                osz = c125154vf.LIZ(null, false);
                            }
                            C79057V0z.LJJJJL(LJI(), "update_status_null_effect_track", C76800UCe.LIZ);
                            if (osz != null) {
                                C79057V0z.LJJJJL(LJI(), "delete_slot_event", new C122684rg(EnumC123864ta.EFFECT, (NLETrack) osz.getFirst(), (NLETrackSlot) osz.getSecond()));
                            }
                            VideoPublishEditModel LJFF2 = LJFF();
                            if (LJFF2 == null) {
                                return;
                            }
                            C5QW.LJIJJLI("delete", LJFF2, LJI(), null, "effect", false, 40);
                            return;
                        case -459287747:
                            if (!str2.equals("bottom_item_root_effects")) {
                                return;
                            }
                            break;
                        case 12651508:
                            if (!str2.equals("bottom_item_effect_edit_copy") || selectedTrackSlot == null) {
                                return;
                            }
                            C125154vf c125154vf2 = (C125154vf) this.LJII.getValue();
                            if (c125154vf2 != null) {
                                long LJ = c125154vf2.LJ(selectedTrackSlot.getEndTime());
                                if (LJ >= 0) {
                                    if (LJ == Long.MAX_VALUE) {
                                        min = selectedTrackSlot.getDuration();
                                    } else {
                                        min = Math.min(selectedTrackSlot.getDuration(), LJ);
                                    }
                                    OSZ osz2 = new OSZ(Long.valueOf(selectedTrackSlot.getEndTime()), Long.valueOf(selectedTrackSlot.getEndTime() + min));
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.addAll(C124574uj.LJIILIIL(C79057V0z.LJJI(c125154vf2.LIZIZ())));
                                    NLETrack LJ2 = C124614un.LJ(osz2, arrayList);
                                    if (LJ2 == null) {
                                        if (!c125154vf2.LJFF(selectedTrackSlot.getEndTime())) {
                                            LJ2 = C124614un.LIZ(C79057V0z.LJJI(c125154vf2.LIZIZ()));
                                        }
                                    }
                                    NLETrackSlot LJIJJLI = c125154vf2.LIZIZ().getEditor().LJIJJLI(LJ2, new C122834rv(selectedTrackSlot, selectedTrackSlot.getEndTime(), min), EnumC124724uy.NONE);
                                    if (LJIJJLI != null) {
                                        LJIJJLI.setExtra("slot_add_order", String.valueOf(C124574uj.LJIIJJI(C79057V0z.LJJI(c125154vf2.LIZIZ()))));
                                        NLEModel LIZLLL = c125154vf2.LIZLLL();
                                        if (c125154vf2.LIZIZ) {
                                            enumC126794yJ = EnumC126794yJ.MULTI_TRACK;
                                        } else {
                                            enumC126794yJ = EnumC126794yJ.EDITOR_PRO;
                                        }
                                        C123254sb.LJ(LJIJJLI, null, LIZLLL, enumC126794yJ);
                                    }
                                    C79057V0z.LJIILL(c125154vf2.LIZIZ(), C6YK.LIZ(new C139795eB(EnumC126814yL.COPY_VIDEO_EFFECT.getNameId(), null, null, null, null, 30)));
                                    C79057V0z.LJJJJL(c125154vf2.LIZIZ(), "select_slot_event", new C127594zb(LJIJJLI, null, 14));
                                }
                            }
                            VideoPublishEditModel LJFF3 = LJFF();
                            if (LJFF3 == null) {
                                return;
                            }
                            C5QW.LJIJJLI("copy", LJFF3, LJI(), null, null, false, 56);
                            return;
                        case 304438075:
                            if (!str2.equals("bottom_item_effect_edit_replace_effect") || selectedTrackSlot == null) {
                                return;
                            }
                            if (this.LJII.getValue() != null) {
                                LJ(new VideoEffectFragment(new C125974wz(EnumC126774yH.REPLACE, C124574uj.LJIJJ(selectedTrackSlot), selectedTrackSlot.getStartTime(), selectedTrackSlot.getDuration())));
                            }
                            VideoPublishEditModel LJFF4 = LJFF();
                            if (LJFF4 == null) {
                                return;
                            }
                            C5QW.LJIJJLI("replace", LJFF4, LJI(), null, null, false, 56);
                            return;
                        case 1481379918:
                            if (!str2.equals("bottom_item_effect_add_effects")) {
                                return;
                            }
                            break;
                        default:
                            return;
                    }
                    if (C6ZT.LIZ(this.LIZ.findViewById(this.LIZIZ))) {
                        return;
                    }
                    C125154vf c125154vf3 = (C125154vf) this.LJII.getValue();
                    if (c125154vf3 != null && (LIZJ = c125154vf3.LIZJ()) != null) {
                        VideoEffectFragment videoEffectFragment = new VideoEffectFragment(LIZJ);
                        if (o.LJ(funcItem.LJ, "bottom_item_root_effects")) {
                            VideoPublishEditModel LJFF5 = LJFF();
                            if (LJFF5 != null) {
                                EditorProContext editorContext = LJI();
                                o.LJIIIZ(editorContext, "editorContext");
                                InitialMobParams initialMobParams = LJFF5.creativeModel.initialModel.mobParams;
                                if (initialMobParams != null) {
                                    str = initialMobParams.enterType;
                                } else {
                                    str = null;
                                }
                                if (str != null && str.length() != 0) {
                                    str3 = str;
                                }
                                C145995oB LJFF6 = C5QW.LJFF(LJFF5, editorContext);
                                LJFF6.LIZ(1, "is_editor_pro");
                                LJFF6.LIZ(1, "is_multi_track");
                                LJFF6.LJI("enter_type", str3);
                                FMX.LJIIL("click_effect_entrance", LJFF6.LIZ);
                            }
                            videoEffectFragment.LJZI = C124574uj.LJIILIIL(C79057V0z.LJJI(LJI())).isEmpty();
                        }
                        C79057V0z.LJJI(LJI()).setExtra("enter_add_effect_time", String.valueOf(System.currentTimeMillis()));
                        LJ(videoEffectFragment);
                    }
                    if (!o.LJ(funcItem.LJ, "bottom_item_effect_add_effects") || (LJFF = LJFF()) == null) {
                        return;
                    }
                    C5QW.LJIJJLI("add", LJFF, LJI(), null, "effect", false, 40);
                }
            });
            final ActivityC45651qj activity2 = getActivity();
            c50q.LJIIIIZZ(new AbstractC1282851s(activity2) { // from class: X.4yG
                public final ArrayList<String> LJ;
                public final C62822Ol8 LJFF;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(activity2);
                    o.LJIIIZ(activity2, "activity");
                    this.LJ = C47261Igj.LJII("bottom_item_root_magic");
                    this.LJFF = C221108m2.LIZIZ(C123584t8.LJLIL);
                }

                @Override // X.C52A
                public final boolean LIZ(AnonymousClass523 funcItem) {
                    o.LJIIIZ(funcItem, "funcItem");
                    return this.LJ.contains(funcItem.LJ);
                }

                @Override // X.C52A
                public final void LIZIZ(AnonymousClass523 funcItem, View view) {
                    o.LJIIIZ(funcItem, "funcItem");
                    if (!funcItem.LJFF || !o.LJ(funcItem.LJ, "bottom_item_root_magic") || C6ZT.LIZ(this.LIZ.findViewById(this.LIZIZ))) {
                        return;
                    }
                    VideoPublishEditModel LIZIZ = C132805Jc.LIZIZ(EditModelProvider.Companion);
                    if (LIZIZ != null) {
                        EditorProContext editorContext = (EditorProContext) this.LJFF.getValue();
                        o.LJIIIZ(editorContext, "editorContext");
                        C145995oB LJFF = C5QW.LJFF(LIZIZ, editorContext);
                        LJFF.LJI("enter_method", "click_button");
                        LJFF.LJI("is_editor_pro", "1");
                        FMX.LJIIL("click_magic_tab", LJFF.LIZ);
                    }
                    ((EditorProContext) this.LJFF.getValue()).getPlayer().pause();
                    LJ(new MagicFragment());
                }
            });
            final ActivityC45651qj activity3 = getActivity();
            c50q.LJ(new C53G(activity3) { // from class: X.51d
                public final C62822Ol8 LIZ;
                public boolean LIZIZ;

                {
                    o.LJIIIZ(activity3, "activity");
                    this.LIZ = C221108m2.LIZIZ(C51X.LJLIL);
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
                
                    if (r3.equals("bottom_item_overlay_edit_speed") == false) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
                
                    r4 = "speed";
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
                
                    if (r3.equals("bottom_item_overlay_edit_split") == false) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x009c, code lost:
                
                    r4 = "split";
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x0084, code lost:
                
                    if (r3.equals("bottom_item_overlay_edit_delete") == false) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x0112, code lost:
                
                    r4 = "delete";
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x008d, code lost:
                
                    if (r3.equals("bottom_item_edit_speed") == false) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
                
                    if (r3.equals("bottom_item_edit_split") == false) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:
                
                    if (r3.equals("bottom_item_overlay_edit_rotate") == false) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:45:0x0120, code lost:
                
                    r4 = "rotate";
                 */
                /* JADX WARN: Code restructure failed: missing block: B:47:0x00ae, code lost:
                
                    if (r3.equals("bottom_item_overlay_edit_volume") == false) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:48:0x012e, code lost:
                
                    r4 = "volume";
                 */
                /* JADX WARN: Code restructure failed: missing block: B:50:0x00b8, code lost:
                
                    if (r3.equals("bottom_item_overlay_edit_replace") == false) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:51:0x00c6, code lost:
                
                    r4 = "replace";
                 */
                /* JADX WARN: Code restructure failed: missing block: B:53:0x00c2, code lost:
                
                    if (r3.equals("bottom_item_edit_replace") == false) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:55:0x00d0, code lost:
                
                    if (r3.equals("bottom_item_overlay_edit_copy") == false) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:56:0x00e8, code lost:
                
                    r4 = "copy";
                 */
                /* JADX WARN: Code restructure failed: missing block: B:58:0x00da, code lost:
                
                    if (r3.equals("bottom_item_overlay_edit_crop") == false) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:59:0x00f6, code lost:
                
                    r4 = "crop";
                 */
                /* JADX WARN: Code restructure failed: missing block: B:61:0x00e4, code lost:
                
                    if (r3.equals("bottom_item_edit_copy") == false) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:63:0x00f2, code lost:
                
                    if (r3.equals("bottom_item_edit_crop") == false) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:68:0x010e, code lost:
                
                    if (r3.equals("bottom_item_edit_delete") == false) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:70:0x011c, code lost:
                
                    if (r3.equals("bottom_item_edit_rotate") == false) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x012a, code lost:
                
                    if (r3.equals("bottom_item_edit_volume") == false) goto L9;
                 */
                @Override // X.C53G
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(X.AnonymousClass523 r6) {
                    /*
                        Method dump skipped, instructions count: 390
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1281351d.LIZ(X.523):void");
                }

                @Override // X.C53G
                public final void LIZIZ(AnonymousClass523 item) {
                    o.LJIIIZ(item, "item");
                    if (o.LJ(item.LJ, "bottom_item_root_edit")) {
                        this.LIZIZ = true;
                    }
                }
            });
        } else {
            c50q = null;
        }
        this.LJLL = c50q;
        VideoPublishEditModel LJJLIIIJILLIZJL2 = LJJLIIIJILLIZJL();
        if ((LJJLIIIJILLIZJL2 != null && C44384HbQ.LJJIJL(LJJLIIIJILLIZJL2) && (LJJLIIIJILLIZJL = LJJLIIIJILLIZJL()) != null && C44384HbQ.LLJILJILJ(LJJLIIIJILLIZJL)) || (c50q2 = this.LJLL) == null || (LJI = c50q2.LJI()) == null) {
            return;
        }
        LJI.LIZJ("bottom_item_root_text", "bottom_item_text_captions");
    }

    private final void LJLJJLL(boolean z) {
        C1297357h c1297357h;
        C58D jB = jB();
        if (jB != null) {
            jB.enableMainTrackClickable(!z);
        }
        C58D jB2 = jB();
        if (jB2 != null) {
            jB2.setMainTrackBtnVisibility(!z);
        }
        C58D jB3 = jB();
        if (jB3 != null) {
            jB3.enableMainTrackShowTips(!z);
        }
        C58D jB4 = jB();
        if (jB4 != null && (c1297357h = (C1297357h) jB4.findViewById(R.id.gp3)) != null) {
            c1297357h.setLongClickEnable(!z);
        }
        C1284452i c1284452i = this.LJLLI;
        if (c1284452i != null) {
            boolean z2 = !z;
            c1284452i.LJLIL.setEnableTinyScroller$editor_trackpanel_release(z2);
            c1284452i.LJLILLLLZI.LJLLLLLL = z2;
            c1284452i.LJLIL.setPipDropVisibility(z2);
        }
    }

    private final String LJLJLJ(C132045Ge c132045Ge) {
        this.LJLLJ = c132045Ge.getRetakeCommitId();
        boolean effectMultiTrackMode = c132045Ge.getEffectMultiTrackMode();
        this.LJLLL = effectMultiTrackMode;
        this.LJLJJI = c132045Ge;
        C1282051k c1282051k = this.LJLLILLLL;
        if (c1282051k != null && c1282051k.LJ != effectMultiTrackMode) {
            c1282051k.LJ = effectMultiTrackMode;
            C50Q c50q = this.LJLL;
            if (c50q != null) {
                c50q.LIZJ(c1282051k);
            }
            LJLJJLL(this.LJLLL);
        }
        VideoPublishEditModel editModel = c132045Ge.getEditModel();
        if (editModel != null) {
            this.LJLLLL = editModel.isRetakeVideo();
            EditModelProvider.Companion.getClass();
            C126784yI.LIZ().setEditModel(editModel);
            EditorProContext editorContext = LJJLIIIJJI();
            o.LJIIIZ(editorContext, "editorContext");
            AnonymousClass569.LIZIZ = editorContext;
            AnonymousClass569.LIZJ = editModel;
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = editModel.multiEditVideoRecordData;
            if (multiEditVideoStatusRecordData != null && multiEditVideoStatusRecordData.curMultiEditVideoRecordData != null && !C38891fp.LJJI(multiEditVideoStatusRecordData.curMultiEditVideoRecordData.segmentDataList)) {
                AnonymousClass569.LIZ = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
                ArrayList<TimeSpeedModelExtension> arrayList = multiEditVideoStatusRecordData.originalSegments;
                if (arrayList != null) {
                    AnonymousClass569.LJFF = arrayList;
                    ArrayList<TimeSpeedModelExtension> arrayList2 = multiEditVideoStatusRecordData.editSegments;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(arrayList);
                    }
                    AnonymousClass569.LJII = arrayList2;
                    ArrayList<TimeSpeedModelExtension> arrayList3 = multiEditVideoStatusRecordData.restoreSegments;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList<>(AnonymousClass569.LJII);
                    }
                    AnonymousClass569.LJI = arrayList3;
                }
                MultiEditVideoRecordData multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
                AnonymousClass569.LIZ = multiEditVideoRecordData;
                MultiEditVideoRecordData multiEditVideoRecordData2 = multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData;
                if (multiEditVideoRecordData2 == null) {
                    AnonymousClass569.LIZLLL = C6BI.LIZIZ(multiEditVideoRecordData, null);
                } else {
                    AnonymousClass569.LIZLLL = multiEditVideoRecordData2;
                }
                AnonymousClass569.LJ = C6BI.LIZIZ(AnonymousClass569.LIZ, null);
                AnonymousClass569.LJIIIZ = multiEditVideoStatusRecordData.recordMusic;
                AnonymousClass569.LJIIJ = multiEditVideoStatusRecordData.originalMusicStart;
                ArrayList<LibraryMaterialInfoSv> arrayList4 = editModel.libraryMaterialList;
                if (arrayList4 != null) {
                    AnonymousClass569.LJIIIIZZ = arrayList4;
                }
                AnonymousClass569.LJIIL = true;
            }
        }
        VideoPublishEditModel editModel2 = c132045Ge.getEditModel();
        if (editModel2 == null) {
            return null;
        }
        return editModel2.nleData;
    }

    public final boolean LJLJJL(String str) {
        if (o.LJ(str, "video_transition") || o.LJ(str, "magic_panel")) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1294756h
    public void gl0(boolean z) {
        this.LL = z;
    }

    public C51W(EditorProScene parentScene, C82622Wbi diContainer) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = parentScene;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = this;
        this.LJLJJLL = UCI.LJII(getDiContainer(), C51E.class, null);
        this.LJLJL = UCI.LJII(getDiContainer(), InterfaceC1278950f.class, null);
        this.LJLJLJ = UCI.LJII(getDiContainer(), C52T.class, null);
        this.LJLJLLL = C127834zz.LIZ();
        this.LJZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 584));
        this.LJZI = C221108m2.LIZIZ(C51N.LJLIL);
        this.LJZL = new InterfaceC1281251c() { // from class: X.51L
            @Override // X.InterfaceC1281251c
            public final void LIZ() {
                C2ND.LIZ(new AqS152S0100000_2(C51W.this, 585), 0L);
            }
        };
    }

    @Override // X.InterfaceC1294756h
    public void EK(C132045Ge editorProInitData, C51Z c51z) {
        SurfaceView surfaceView;
        boolean z;
        o.LJIIIZ(editorProInitData, "editorProInitData");
        System.currentTimeMillis();
        if (!isInitialized()) {
            this.LJLJJL = c51z;
            if (C78685UuP.LJJJZ(this.LJLIL.getEditorProAnchorType())) {
                EditModelProvider.Companion.getClass();
                C126784yI.LIZ().setAnchorType(this.LJLIL.getEditorProAnchorType());
            }
            LJLJLJ(editorProInitData);
            InterfaceC126684y8 interfaceC126684y8 = null;
            if (c51z != null) {
                surfaceView = c51z.LIZIZ;
            } else {
                surfaceView = null;
            }
            IPreviewService LIZIZ = C127834zz.LIZIZ();
            if (LIZIZ != null) {
                LIZIZ.init(LJJLIIIJJIZ(), C79057V0z.LJJ(LJJLIIIJJI()), surfaceView);
            }
            EditorProContext LJJLIIIJJI = LJJLIIIJJI();
            LJJLIIIJJI.setEnableConfig(C126934yX.LIZ(), true);
            VideoPublishEditModel LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
            if (LJJLIIIJILLIZJL != null) {
                z = LJJLIIIJILLIZJL.isMvThemeVideoType();
            } else {
                z = false;
            }
            LJJLIIIJJI.setIsMvMode(z);
            String LJJLIIJ = LJJLIIJ();
            if (c51z != null) {
                interfaceC126684y8 = c51z.LIZ;
            }
            LJJLIIIJJI.init(LJJLIIJ, surfaceView, interfaceC126684y8);
        }
    }

    @Override // X.InterfaceC1294756h
    public void GS(ViewGroup contentView, NavigationScene navigationScene) {
        o.LJIIIZ(contentView, "contentView");
        System.currentTimeMillis();
        if (!isInitialized()) {
            LJJLJ();
            LJLIIL();
            LJJZZIII();
            LJJLJLI();
            if (!((Boolean) C147555qh.LIZ.getValue()).booleanValue()) {
                LJJZZI(navigationScene);
            }
            gl0(true);
        }
    }

    @Override // X.InterfaceC1294756h
    public void bp0(C132045Ge editorProInitData, final InterfaceC126614y1 interfaceC126614y1) {
        o.LJIIIZ(editorProInitData, "editorProInitData");
        String LJLJLJ = LJLJLJ(editorProInitData);
        if (LJLJLJ != null) {
            LJJLIIIJJI().renderNLEData(LJLJLJ, false, new InterfaceC126614y1() { // from class: X.51O
                @Override // X.InterfaceC126614y1
                public final void onSuccess() {
                    InterfaceC126614y1 interfaceC126614y12 = InterfaceC126614y1.this;
                    if (interfaceC126614y12 != null) {
                        interfaceC126614y12.onSuccess();
                    }
                }

                @Override // X.InterfaceC126614y1
                public final void onError(int i, String str) {
                    InterfaceC126614y1 interfaceC126614y12 = InterfaceC126614y1.this;
                    if (interfaceC126614y12 != null) {
                        interfaceC126614y12.onError(i, str);
                    }
                }
            });
        }
    }
}
