package X;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Jy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class DialogC158506Jy extends C18Z {
    public final long LJLJI;
    public final C62822Ol8 LJLJJI;
    public View LJLJJL;
    public C158436Jr LJLJJLL;
    public long LJLJL;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r1 >= r0.getHeight()) goto L16;
     */
    @Override // android.app.Dialog, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            java.lang.String r0 = "ev"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            int r0 = r8.getAction()
            r4 = 1
            if (r0 != r4) goto Lab
            float r0 = r8.getX()
            r6 = 0
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L42
            float r0 = r8.getY()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L42
            float r1 = r8.getX()
            android.view.View r0 = r7.LJLJJL
            java.lang.String r2 = "content"
            if (r0 == 0) goto La7
            int r0 = r0.getWidth()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L42
            float r1 = r8.getY()
            android.view.View r0 = r7.LJLJJL
            if (r0 == 0) goto La3
            int r0 = r0.getHeight()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto Lab
        L42:
            X.6Jr r5 = r7.LJLJJLL
            if (r5 == 0) goto L88
            X.6Jg r0 = r5.LIZ
            X.6Jn r3 = r0.LJLJI
            java.lang.String r2 = "edLiveTitle"
            if (r3 == 0) goto L9f
            float r0 = r8.getRawX()
            int r1 = (int) r0
            float r0 = r8.getRawY()
            int r0 = (int) r0
            boolean r0 = X.C78840Uwu.LJIIIZ(r1, r0, r3)
            if (r0 == 0) goto L89
            X.6Jg r0 = r5.LIZ
            X.6Jn r0 = r0.LJLJI
            if (r0 == 0) goto L9b
            X.V3N.LJJIIZI(r0)
            X.6Jg r0 = r5.LIZ
            r0.setState(r4)
            X.6Jy r0 = r5.LIZIZ
            r0.dismiss()
            X.6Jg r1 = r5.LIZ
            android.widget.LinearLayout r3 = r1.LJLIL
            if (r3 == 0) goto L95
            Y.ARunnableS38S0100000_2 r2 = new Y.ARunnableS38S0100000_2
            r0 = 184(0xb8, float:2.58E-43)
            r2.<init>(r1, r0)
            r0 = 200(0xc8, double:9.9E-322)
            r3.postDelayed(r2, r0)
            X.6Jg r0 = r5.LIZ
            r0.LIZIZ()
        L88:
            return r4
        L89:
            X.6Jg r0 = r5.LIZ
            X.6Js r0 = r0.getLiveCDStickerInterface()
            if (r0 == 0) goto L88
            r0.LIZIZ(r8)
            goto L88
        L95:
            java.lang.String r0 = "container"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r6
        L9b:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r6
        L9f:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r6
        La3:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r6
        La7:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r6
        Lab:
            boolean r0 = super.dispatchTouchEvent(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC158506Jy.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.l2);
        View findViewById = findViewById(R.id.j71);
        o.LJI(findViewById);
        this.LJLJJL = findViewById;
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        if (this.LJLJL == 0) {
            this.LJLJL = System.currentTimeMillis();
        }
        final C158516Jz c158516Jz = (C158516Jz) this.LJLJJI.getValue();
        if (c158516Jz != null) {
            long j = this.LJLJI;
            C16880lQ.LLLLIILL(c158516Jz.LJLJJL, R.layout.l1, c158516Jz, true);
            if (C173636rf.LIZIZ(c158516Jz.getContext())) {
                c158516Jz.findViewById(R.id.g53).setVisibility(8);
                c158516Jz.findViewById(R.id.g54).setVisibility(0);
                View findViewById2 = c158516Jz.findViewById(R.id.glu);
                o.LJII(findViewById2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.LiveCDNumberPicker");
                c158516Jz.LJLILLLLZI = (C6K0) findViewById2;
                View findViewById3 = c158516Jz.findViewById(R.id.e88);
                o.LJII(findViewById3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.LiveCDNumberPicker");
                c158516Jz.LJLJI = (C6K0) findViewById3;
                View findViewById4 = c158516Jz.findViewById(R.id.gk1);
                o.LJII(findViewById4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.LiveCDNumberPicker");
                c158516Jz.LJLJJI = (C6K0) findViewById4;
            } else {
                c158516Jz.findViewById(R.id.g53).setVisibility(0);
                c158516Jz.findViewById(R.id.g54).setVisibility(8);
                View findViewById5 = c158516Jz.findViewById(R.id.glt);
                o.LJII(findViewById5, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.LiveCDNumberPicker");
                c158516Jz.LJLILLLLZI = (C6K0) findViewById5;
                View findViewById6 = c158516Jz.findViewById(R.id.e87);
                o.LJII(findViewById6, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.LiveCDNumberPicker");
                c158516Jz.LJLJI = (C6K0) findViewById6;
                View findViewById7 = c158516Jz.findViewById(R.id.gk0);
                o.LJII(findViewById7, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.LiveCDNumberPicker");
                c158516Jz.LJLJJI = (C6K0) findViewById7;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            c158516Jz.LJLIL = gregorianCalendar;
            gregorianCalendar.setTimeInMillis(j);
            C6K0 c6k0 = c158516Jz.LJLILLLLZI;
            if (c6k0 != null) {
                final Context context = c158516Jz.getContext();
                o.LJIIIIZZ(context, "context");
                final Calendar calendar = c158516Jz.LJLIL;
                if (calendar != null) {
                    c6k0.LLIIII = new QZV(context, calendar) { // from class: X.6K2
                        public final Context LIZ;
                        public final Calendar LIZIZ;
                        public final List<String> LIZJ;

                        @Override // X.QZV
                        public final void LJIIJJI(String vale) {
                            o.LJIIIZ(vale, "vale");
                        }

                        public static final Integer LJIJI() {
                            return 30;
                        }

                        @Override // X.QZV
                        public final String LJIILIIL(int i) {
                            if (i > 30 || i < 0) {
                                return "";
                            }
                            GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
                            gregorianCalendar2.setTimeInMillis(this.LIZIZ.getTimeInMillis());
                            gregorianCalendar2.add(5, i);
                            if (this.LIZIZ.get(1) == gregorianCalendar2.get(1) && this.LIZIZ.get(2) == gregorianCalendar2.get(2) && this.LIZIZ.get(5) == gregorianCalendar2.get(5)) {
                                return C29822Bn8.LIZ(this.LIZ, R.string.dxn, "context.resources.getStr…date_time_dialogue_today)");
                            }
                            int i2 = gregorianCalendar2.get(5);
                            if (C173636rf.LIZIZ(this.LIZ)) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append(i2);
                                LIZ.append(' ');
                                LIZ.append((String) ListProtector.get(this.LIZJ, gregorianCalendar2.get(2)));
                                return X1D.LIZIZ(LIZ);
                            }
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append((String) ListProtector.get(this.LIZJ, gregorianCalendar2.get(2)));
                            LIZ2.append(' ');
                            LIZ2.append(i2);
                            return X1D.LIZIZ(LIZ2);
                        }

                        {
                            this.LIZ = context;
                            this.LIZIZ = calendar;
                            this.LIZJ = C47261Igj.LJJIJIIJI(context.getResources().getString(R.string.dxf), context.getResources().getString(R.string.dxe), context.getResources().getString(R.string.dxi), context.getResources().getString(R.string.dxb), context.getResources().getString(R.string.dxj), context.getResources().getString(R.string.dxh), context.getResources().getString(R.string.dxg), context.getResources().getString(R.string.dxc), context.getResources().getString(R.string.dxm), context.getResources().getString(R.string.dxl), context.getResources().getString(R.string.dxk), context.getResources().getString(R.string.dxd));
                        }
                    };
                    c6k0.LJLJJL = C6K2.LJIJI();
                    c6k0.LJLJJLL = 0;
                    c6k0.LJ();
                    c6k0.invalidate();
                    C6K0 c6k02 = c158516Jz.LJLILLLLZI;
                    if (c6k02 != null) {
                        c6k02.setTextAlign(Paint.Align.CENTER);
                        C6K0 c6k03 = c158516Jz.LJLILLLLZI;
                        if (c6k03 != null) {
                            Context context2 = c158516Jz.getContext();
                            o.LJIIIIZZ(context2, "context");
                            c6k03.setMaxWidth((int) ((C74275TDb.LJ(c158516Jz.getContext()) / 2.0f) - C74275TDb.LIZIZ(context2, 80.0f)));
                            C6K0 c6k04 = c158516Jz.LJLJI;
                            if (c6k04 != null) {
                                c6k04.setTextAlign(Paint.Align.LEFT);
                                C6K0 c6k05 = c158516Jz.LJLJJI;
                                if (c6k05 != null) {
                                    c6k05.setTextAlign(Paint.Align.LEFT);
                                    C6K0 c6k06 = c158516Jz.LJLILLLLZI;
                                    if (c6k06 != null) {
                                        C158516Jz.LIZ(30, c6k06);
                                        C6K0 c6k07 = c158516Jz.LJLJI;
                                        if (c6k07 != null) {
                                            C158516Jz.LIZ(23, c6k07);
                                            C6K0 c6k08 = c158516Jz.LJLJJI;
                                            if (c6k08 != null) {
                                                C158516Jz.LIZ(59, c6k08);
                                                C6K0 c6k09 = c158516Jz.LJLILLLLZI;
                                                if (c6k09 != null) {
                                                    c6k09.setOnValueChangedListener(new C6K5() { // from class: X.6K1
                                                        @Override // X.C6K5
                                                        public final void LIZ(C6K0 picker, String oldVal, String newVal) {
                                                            C158366Jk c158366Jk;
                                                            o.LJIIIZ(picker, "picker");
                                                            o.LJIIIZ(oldVal, "oldVal");
                                                            o.LJIIIZ(newVal, "newVal");
                                                            C158516Jz.this.LIZIZ();
                                                            C158516Jz c158516Jz2 = C158516Jz.this;
                                                            C6K0 c6k010 = c158516Jz2.LJLILLLLZI;
                                                            if (c6k010 != null) {
                                                                int currentPosition = c6k010.getCurrentPosition();
                                                                C6K0 c6k011 = C158516Jz.this.LJLJI;
                                                                if (c6k011 != null) {
                                                                    int currentPosition2 = c6k011.getCurrentPosition();
                                                                    C6K0 c6k012 = C158516Jz.this.LJLJJI;
                                                                    if (c6k012 != null) {
                                                                        int currentPosition3 = c6k012.getCurrentPosition();
                                                                        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
                                                                        gregorianCalendar2.setTimeInMillis(System.currentTimeMillis());
                                                                        float f = currentPosition3 * 60.0f;
                                                                        float f2 = (f + (((currentPosition2 * 60.0f) * 60.0f) + (((currentPosition * 24.0f) * 60.0f) * 60.0f))) - (((gregorianCalendar2.get(12) * 60.0f) + ((gregorianCalendar2.get(11) * 60.0f) * 60.0f)) + gregorianCalendar2.get(13));
                                                                        if (f2 > 0.0f) {
                                                                            int i = (int) (f2 / 86400.0f);
                                                                            float f3 = (int) (f2 - (((i * 24.0f) * 60.0f) * 60.0f));
                                                                            int i2 = (int) (f3 / 3600.0f);
                                                                            float f4 = (int) (f3 - ((i2 * 60.0f) * 60.0f));
                                                                            int i3 = (int) (f4 / 60.0f);
                                                                            int i4 = (int) (f4 - (i3 * 60.0f));
                                                                            GregorianCalendar gregorianCalendar3 = new GregorianCalendar();
                                                                            gregorianCalendar3.setTimeInMillis(gregorianCalendar2.getTimeInMillis());
                                                                            gregorianCalendar3.add(5, i);
                                                                            gregorianCalendar3.add(11, i2);
                                                                            gregorianCalendar3.add(12, i3);
                                                                            gregorianCalendar3.add(13, i4);
                                                                            c158366Jk = new C158366Jk(C77123UOp.LJJIJ(gregorianCalendar3.getTimeInMillis()), String.valueOf(i), String.valueOf(i2), String.valueOf(i3), String.valueOf(i4));
                                                                        } else {
                                                                            c158366Jk = new C158366Jk(C77123UOp.LJJIJ(gregorianCalendar2.getTimeInMillis()), CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT);
                                                                        }
                                                                        C6K8 c6k8 = c158516Jz2.LJLJJLL;
                                                                        if (c6k8 != null) {
                                                                            c6k8.LIZ(c158366Jk.LJ, c158366Jk.LIZ, c158366Jk.LIZIZ, c158366Jk.LIZJ, c158366Jk.LIZLLL);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    o.LJIJI("mMinutesPicker");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("mHoursPicker");
                                                                throw null;
                                                            }
                                                            o.LJIJI("mMonthDayPicker");
                                                            throw null;
                                                        }
                                                    });
                                                    C6K0 c6k010 = c158516Jz.LJLJI;
                                                    if (c6k010 != null) {
                                                        c6k010.setOnValueChangedListener(new C6K5() { // from class: X.6K1
                                                            @Override // X.C6K5
                                                            public final void LIZ(C6K0 picker, String oldVal, String newVal) {
                                                                C158366Jk c158366Jk;
                                                                o.LJIIIZ(picker, "picker");
                                                                o.LJIIIZ(oldVal, "oldVal");
                                                                o.LJIIIZ(newVal, "newVal");
                                                                C158516Jz.this.LIZIZ();
                                                                C158516Jz c158516Jz2 = C158516Jz.this;
                                                                C6K0 c6k0102 = c158516Jz2.LJLILLLLZI;
                                                                if (c6k0102 != null) {
                                                                    int currentPosition = c6k0102.getCurrentPosition();
                                                                    C6K0 c6k011 = C158516Jz.this.LJLJI;
                                                                    if (c6k011 != null) {
                                                                        int currentPosition2 = c6k011.getCurrentPosition();
                                                                        C6K0 c6k012 = C158516Jz.this.LJLJJI;
                                                                        if (c6k012 != null) {
                                                                            int currentPosition3 = c6k012.getCurrentPosition();
                                                                            GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
                                                                            gregorianCalendar2.setTimeInMillis(System.currentTimeMillis());
                                                                            float f = currentPosition3 * 60.0f;
                                                                            float f2 = (f + (((currentPosition2 * 60.0f) * 60.0f) + (((currentPosition * 24.0f) * 60.0f) * 60.0f))) - (((gregorianCalendar2.get(12) * 60.0f) + ((gregorianCalendar2.get(11) * 60.0f) * 60.0f)) + gregorianCalendar2.get(13));
                                                                            if (f2 > 0.0f) {
                                                                                int i = (int) (f2 / 86400.0f);
                                                                                float f3 = (int) (f2 - (((i * 24.0f) * 60.0f) * 60.0f));
                                                                                int i2 = (int) (f3 / 3600.0f);
                                                                                float f4 = (int) (f3 - ((i2 * 60.0f) * 60.0f));
                                                                                int i3 = (int) (f4 / 60.0f);
                                                                                int i4 = (int) (f4 - (i3 * 60.0f));
                                                                                GregorianCalendar gregorianCalendar3 = new GregorianCalendar();
                                                                                gregorianCalendar3.setTimeInMillis(gregorianCalendar2.getTimeInMillis());
                                                                                gregorianCalendar3.add(5, i);
                                                                                gregorianCalendar3.add(11, i2);
                                                                                gregorianCalendar3.add(12, i3);
                                                                                gregorianCalendar3.add(13, i4);
                                                                                c158366Jk = new C158366Jk(C77123UOp.LJJIJ(gregorianCalendar3.getTimeInMillis()), String.valueOf(i), String.valueOf(i2), String.valueOf(i3), String.valueOf(i4));
                                                                            } else {
                                                                                c158366Jk = new C158366Jk(C77123UOp.LJJIJ(gregorianCalendar2.getTimeInMillis()), CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT);
                                                                            }
                                                                            C6K8 c6k8 = c158516Jz2.LJLJJLL;
                                                                            if (c6k8 != null) {
                                                                                c6k8.LIZ(c158366Jk.LJ, c158366Jk.LIZ, c158366Jk.LIZIZ, c158366Jk.LIZJ, c158366Jk.LIZLLL);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        o.LJIJI("mMinutesPicker");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("mHoursPicker");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("mMonthDayPicker");
                                                                throw null;
                                                            }
                                                        });
                                                        C6K0 c6k011 = c158516Jz.LJLJJI;
                                                        if (c6k011 != null) {
                                                            c6k011.setOnValueChangedListener(new C6K5() { // from class: X.6K1
                                                                @Override // X.C6K5
                                                                public final void LIZ(C6K0 picker, String oldVal, String newVal) {
                                                                    C158366Jk c158366Jk;
                                                                    o.LJIIIZ(picker, "picker");
                                                                    o.LJIIIZ(oldVal, "oldVal");
                                                                    o.LJIIIZ(newVal, "newVal");
                                                                    C158516Jz.this.LIZIZ();
                                                                    C158516Jz c158516Jz2 = C158516Jz.this;
                                                                    C6K0 c6k0102 = c158516Jz2.LJLILLLLZI;
                                                                    if (c6k0102 != null) {
                                                                        int currentPosition = c6k0102.getCurrentPosition();
                                                                        C6K0 c6k0112 = C158516Jz.this.LJLJI;
                                                                        if (c6k0112 != null) {
                                                                            int currentPosition2 = c6k0112.getCurrentPosition();
                                                                            C6K0 c6k012 = C158516Jz.this.LJLJJI;
                                                                            if (c6k012 != null) {
                                                                                int currentPosition3 = c6k012.getCurrentPosition();
                                                                                GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
                                                                                gregorianCalendar2.setTimeInMillis(System.currentTimeMillis());
                                                                                float f = currentPosition3 * 60.0f;
                                                                                float f2 = (f + (((currentPosition2 * 60.0f) * 60.0f) + (((currentPosition * 24.0f) * 60.0f) * 60.0f))) - (((gregorianCalendar2.get(12) * 60.0f) + ((gregorianCalendar2.get(11) * 60.0f) * 60.0f)) + gregorianCalendar2.get(13));
                                                                                if (f2 > 0.0f) {
                                                                                    int i = (int) (f2 / 86400.0f);
                                                                                    float f3 = (int) (f2 - (((i * 24.0f) * 60.0f) * 60.0f));
                                                                                    int i2 = (int) (f3 / 3600.0f);
                                                                                    float f4 = (int) (f3 - ((i2 * 60.0f) * 60.0f));
                                                                                    int i3 = (int) (f4 / 60.0f);
                                                                                    int i4 = (int) (f4 - (i3 * 60.0f));
                                                                                    GregorianCalendar gregorianCalendar3 = new GregorianCalendar();
                                                                                    gregorianCalendar3.setTimeInMillis(gregorianCalendar2.getTimeInMillis());
                                                                                    gregorianCalendar3.add(5, i);
                                                                                    gregorianCalendar3.add(11, i2);
                                                                                    gregorianCalendar3.add(12, i3);
                                                                                    gregorianCalendar3.add(13, i4);
                                                                                    c158366Jk = new C158366Jk(C77123UOp.LJJIJ(gregorianCalendar3.getTimeInMillis()), String.valueOf(i), String.valueOf(i2), String.valueOf(i3), String.valueOf(i4));
                                                                                } else {
                                                                                    c158366Jk = new C158366Jk(C77123UOp.LJJIJ(gregorianCalendar2.getTimeInMillis()), CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT);
                                                                                }
                                                                                C6K8 c6k8 = c158516Jz2.LJLJJLL;
                                                                                if (c6k8 != null) {
                                                                                    c6k8.LIZ(c158366Jk.LJ, c158366Jk.LIZ, c158366Jk.LIZIZ, c158366Jk.LIZJ, c158366Jk.LIZLLL);
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            o.LJIJI("mMinutesPicker");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("mHoursPicker");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("mMonthDayPicker");
                                                                    throw null;
                                                                }
                                                            });
                                                        } else {
                                                            o.LJIJI("mMinutesPicker");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("mHoursPicker");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("mMonthDayPicker");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("mMinutesPicker");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("mHoursPicker");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("mMonthDayPicker");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("mMinutesPicker");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("mHoursPicker");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mMonthDayPicker");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mMonthDayPicker");
                        throw null;
                    }
                } else {
                    o.LJIJI("mCalendar");
                    throw null;
                }
            } else {
                o.LJIJI("mMonthDayPicker");
                throw null;
            }
        }
        C158516Jz c158516Jz2 = (C158516Jz) this.LJLJJI.getValue();
        if (c158516Jz2 != null) {
            c158516Jz2.setSelectTimeMiles(this.LJLJL);
        }
    }

    public DialogC158506Jy(Context context, long j) {
        super(context, R.style.gx);
        this.LJLJI = j;
        this.LJLJJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 971));
    }
}
