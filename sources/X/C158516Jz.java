package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.Calendar;
import kotlin.jvm.internal.o;

/* renamed from: X.6Jz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158516Jz extends LinearLayout {
    public Calendar LJLIL;
    public C6K0 LJLILLLLZI;
    public C6K0 LJLJI;
    public C6K0 LJLJJI;
    public final LayoutInflater LJLJJL;
    public C6K8 LJLJJLL;

    public final void LIZIZ() {
        C6K4 c6k4;
        C6K0 c6k0 = this.LJLILLLLZI;
        if (c6k0 != null) {
            int currentPosition = c6k0.getCurrentPosition();
            C6K0 c6k02 = this.LJLJI;
            if (c6k02 != null) {
                int currentPosition2 = c6k02.getCurrentPosition();
                Calendar calendar = this.LJLIL;
                if (calendar != null) {
                    int i = calendar.get(11);
                    int i2 = calendar.get(12);
                    if (currentPosition != 0) {
                        if (currentPosition != 30) {
                            c6k4 = new C6K4(0, 23, 0, 59);
                        } else {
                            if (currentPosition2 < i) {
                                i2 = 59;
                            }
                            c6k4 = new C6K4(0, i, 0, i2);
                        }
                    } else {
                        if (currentPosition2 > i) {
                            i2 = 0;
                        }
                        c6k4 = new C6K4(i, 23, i2, 59);
                    }
                    C6K0 c6k03 = this.LJLJI;
                    if (c6k03 != null) {
                        c6k03.setMinValue(c6k4.LIZ);
                        C6K0 c6k04 = this.LJLJI;
                        if (c6k04 != null) {
                            c6k04.setMaxValue(c6k4.LIZIZ);
                            C6K0 c6k05 = this.LJLJI;
                            if (c6k05 != null) {
                                int currentPosition3 = c6k05.getCurrentPosition();
                                int i3 = c6k4.LIZ;
                                if (currentPosition3 < i3) {
                                    C6K0 c6k06 = this.LJLJI;
                                    if (c6k06 != null) {
                                        c6k06.LJI(i3);
                                    } else {
                                        o.LJIJI("mHoursPicker");
                                        throw null;
                                    }
                                }
                                C6K0 c6k07 = this.LJLJI;
                                if (c6k07 != null) {
                                    int currentPosition4 = c6k07.getCurrentPosition();
                                    int i4 = c6k4.LIZIZ;
                                    if (currentPosition4 > i4) {
                                        C6K0 c6k08 = this.LJLJI;
                                        if (c6k08 != null) {
                                            c6k08.LJI(i4);
                                        } else {
                                            o.LJIJI("mHoursPicker");
                                            throw null;
                                        }
                                    }
                                    C6K0 c6k09 = this.LJLJI;
                                    if (c6k09 != null) {
                                        c6k09.requestLayout();
                                        C6K0 c6k010 = this.LJLJJI;
                                        if (c6k010 != null) {
                                            c6k010.setMinValue(c6k4.LIZJ);
                                            C6K0 c6k011 = this.LJLJJI;
                                            if (c6k011 != null) {
                                                c6k011.setMaxValue(c6k4.LIZLLL);
                                                C6K0 c6k012 = this.LJLJJI;
                                                if (c6k012 != null) {
                                                    int currentPosition5 = c6k012.getCurrentPosition();
                                                    int i5 = c6k4.LIZJ;
                                                    if (currentPosition5 < i5) {
                                                        C6K0 c6k013 = this.LJLJJI;
                                                        if (c6k013 != null) {
                                                            c6k013.LJI(i5);
                                                        } else {
                                                            o.LJIJI("mMinutesPicker");
                                                            throw null;
                                                        }
                                                    }
                                                    C6K0 c6k014 = this.LJLJJI;
                                                    if (c6k014 != null) {
                                                        int currentPosition6 = c6k014.getCurrentPosition();
                                                        int i6 = c6k4.LIZLLL;
                                                        if (currentPosition6 > i6) {
                                                            C6K0 c6k015 = this.LJLJJI;
                                                            if (c6k015 != null) {
                                                                c6k015.LJI(i6);
                                                            } else {
                                                                o.LJIJI("mMinutesPicker");
                                                                throw null;
                                                            }
                                                        }
                                                        C6K0 c6k016 = this.LJLJJI;
                                                        if (c6k016 != null) {
                                                            c6k016.requestLayout();
                                                            return;
                                                        } else {
                                                            o.LJIJI("mMinutesPicker");
                                                            throw null;
                                                        }
                                                    }
                                                    o.LJIJI("mMinutesPicker");
                                                    throw null;
                                                }
                                                o.LJIJI("mMinutesPicker");
                                                throw null;
                                            }
                                            o.LJIJI("mMinutesPicker");
                                            throw null;
                                        }
                                        o.LJIJI("mMinutesPicker");
                                        throw null;
                                    }
                                    o.LJIJI("mHoursPicker");
                                    throw null;
                                }
                                o.LJIJI("mHoursPicker");
                                throw null;
                            }
                            o.LJIJI("mHoursPicker");
                            throw null;
                        }
                        o.LJIJI("mHoursPicker");
                        throw null;
                    }
                    o.LJIJI("mHoursPicker");
                    throw null;
                }
                o.LJIJI("mCalendar");
                throw null;
            }
            o.LJIJI("mHoursPicker");
            throw null;
        }
        o.LJIJI("mMonthDayPicker");
        throw null;
    }

    public final int getDayOfMonth() {
        Calendar calendar = this.LJLIL;
        if (calendar != null) {
            return calendar.get(5);
        }
        o.LJIJI("mCalendar");
        throw null;
    }

    public final int getMonth() {
        Calendar calendar = this.LJLIL;
        if (calendar != null) {
            return calendar.get(2) + 1;
        }
        o.LJIJI("mCalendar");
        throw null;
    }

    public final int getYear() {
        Calendar calendar = this.LJLIL;
        if (calendar != null) {
            return calendar.get(1);
        }
        o.LJIJI("mCalendar");
        throw null;
    }

    public final void setDateChangedListener(C6K8 listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJLL = listener;
    }

    public final void setSelectTimeMiles(long j) {
        Calendar calendar = this.LJLIL;
        if (calendar != null) {
            long timeInMillis = j - calendar.getTimeInMillis();
            Calendar calendar2 = this.LJLIL;
            if (calendar2 != null) {
                float f = (float) timeInMillis;
                int i = (int) (f / 8.64E7f);
                int i2 = (int) (((int) (f - (i * 8.64E7f))) / 3600000.0f);
                float f2 = calendar2.get(12) + ((int) (((int) (r2 - (i2 * 3600000.0f))) / 60000.0f));
                int i3 = (int) (f2 % 60.0f);
                float f3 = ((int) (f2 / 60.0f)) + i2 + calendar2.get(11);
                int i4 = (int) (f3 % 24.0f);
                int i5 = i + ((int) (f3 / 24.0f));
                C6K0 c6k0 = this.LJLILLLLZI;
                if (c6k0 != null) {
                    c6k0.LJI(i5);
                    C6K0 c6k02 = this.LJLJI;
                    if (c6k02 != null) {
                        c6k02.LJI(i4);
                        C6K0 c6k03 = this.LJLJJI;
                        if (c6k03 != null) {
                            c6k03.LJI(i3);
                            LIZIZ();
                            return;
                        } else {
                            o.LJIJI("mMinutesPicker");
                            throw null;
                        }
                    }
                    o.LJIJI("mHoursPicker");
                    throw null;
                }
                o.LJIJI("mMonthDayPicker");
                throw null;
            }
            o.LJIJI("mCalendar");
            throw null;
        }
        o.LJIJI("mCalendar");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C158516Jz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        Object LLILL = C16880lQ.LLILL(context, "layout_inflater");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.LJLJJL = (LayoutInflater) LLILL;
    }

    public static void LIZ(int i, C6K0 c6k0) {
        c6k0.setMinValue(0);
        c6k0.setMaxValue(i);
        c6k0.setPickerItemCount(5);
        c6k0.setWrapSelectorWheel(false);
        c6k0.setSelectedTextColor(R.color.b5);
        c6k0.setUnselectedTextColor(R.color.c_);
    }
}
