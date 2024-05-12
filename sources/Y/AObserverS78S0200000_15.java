package Y;

import X.C2314896q;
import X.C86057Xq1;
import X.C86926Y9q;
import X.C86927Y9r;
import X.C86928Y9s;
import X.InterfaceC86091XqZ;
import X.SY9;
import X.T5P;
import android.widget.ImageView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicSelectView;
import com.ss.android.ugc.aweme.choosemusic.viewmodel.SelectedMusicViewModel;
import com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateActivity;
import com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment;
import com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSBaseAgeGateViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class AObserverS78S0200000_15 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS78S0200000_15 aObserverS78S0200000_15, Object obj) {
        C86057Xq1 LJ;
        Date defaultDate;
        String format;
        PNSAgeGateActivity this$0 = (PNSAgeGateActivity) aObserverS78S0200000_15.l0;
        PNSAgeGateBaseFragment fragment = (PNSAgeGateBaseFragment) aObserverS78S0200000_15.l1;
        Date it = (Date) obj;
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(fragment, "$fragment");
        PNSBaseAgeGateViewModel LLII = this$0.LLII();
        o.LJIIIIZZ(it, "it");
        LLII.getClass();
        Calendar calendar = Calendar.getInstance();
        InterfaceC86091XqZ interfaceC86091XqZ = LLII.LJLJI;
        if (interfaceC86091XqZ != null && (LJ = interfaceC86091XqZ.LJ()) != null && (defaultDate = LJ.getDefaultDate()) != null) {
            calendar.setTime(defaultDate);
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(it);
        if (calendar.get(2) != calendar2.get(2) || calendar.get(5) != calendar2.get(5)) {
            LLII.LLFFF = false;
        }
        if (LLII.LJZL == 0) {
            LLII.LJZL = System.currentTimeMillis();
        }
        LLII.LJZI = it;
        MutableLiveData<Integer> mutableLiveData = LLII.LJLZ;
        Calendar calendar3 = Calendar.getInstance();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(it);
        int i = calendar3.get(1) - gregorianCalendar.get(1);
        if (calendar3.get(2) != gregorianCalendar.get(2) ? calendar3.get(2) < gregorianCalendar.get(2) : calendar3.get(5) < gregorianCalendar.get(5)) {
            i--;
        }
        mutableLiveData.postValue(Integer.valueOf(i));
        MutableLiveData<String> mutableLiveData2 = LLII.LJLLLLLL;
        Date date = LLII.LJZI;
        String str = "";
        if (date == null || (format = LLII.LJLJLLL.format(date)) == null) {
            format = "";
        }
        mutableLiveData2.postValue(format);
        LLII.LJLLL.postValue(Boolean.TRUE);
        String format2 = ((DateFormat) this$0.LJLJL.getValue()).format(it);
        if (format2 != null) {
            str = format2;
        }
        fragment.Il(str);
    }

    public static final void onChanged$1(AObserverS78S0200000_15 aObserverS78S0200000_15, Object obj) {
        C2314896q c2314896q;
        Boolean bool = (Boolean) obj;
        if (bool != null && ((C86926Y9q) aObserverS78S0200000_15.l0).LIZLLL && (c2314896q = ((C86928Y9s) aObserverS78S0200000_15.l1).LIZ) != null) {
            c2314896q.LIZJ(bool.booleanValue());
        }
    }

    public static final void onChanged$2(AObserverS78S0200000_15 aObserverS78S0200000_15, Object obj) {
        SY9 sy9;
        Boolean bool = (Boolean) obj;
        if (bool != null && ((C86926Y9q) aObserverS78S0200000_15.l0).LIZLLL) {
            T5P t5p = ((C86927Y9r) aObserverS78S0200000_15.l1).LIZ;
            if (t5p != null) {
                if (bool.booleanValue()) {
                    sy9 = ((C86927Y9r) aObserverS78S0200000_15.l1).LIZIZ;
                } else {
                    sy9 = ((C86927Y9r) aObserverS78S0200000_15.l1).LIZJ;
                }
                t5p.setImageDrawable(sy9);
            }
            T5P t5p2 = ((C86927Y9r) aObserverS78S0200000_15.l1).LIZ;
            if (t5p2 != null) {
                t5p2.LIZIZ();
            }
        }
    }

    public static final void onChanged$3(AObserverS78S0200000_15 aObserverS78S0200000_15, Object obj) {
        MusicModel value;
        MusicModel.MusicType musicType;
        Boolean canCut = (Boolean) obj;
        o.LJIIIIZZ(canCut, "canCut");
        if (canCut.booleanValue() && ((value = ((SelectedMusicViewModel) aObserverS78S0200000_15.l0).hv0().getValue()) == null || !value.isSpeechToSong())) {
            MusicModel value2 = ((SelectedMusicViewModel) aObserverS78S0200000_15.l0).hv0().getValue();
            if (value2 != null) {
                musicType = value2.getMusicType();
            } else {
                musicType = null;
            }
            if (musicType != MusicModel.MusicType.SPEECH_MUSIC) {
                ImageView imageView = ((ChooseMusicSelectView) aObserverS78S0200000_15.l1).LJLJLJ;
                if (imageView != null) {
                    imageView.setAlpha(1.0f);
                    return;
                } else {
                    o.LJIJI("mIvMusicCut");
                    throw null;
                }
            }
        }
        ImageView imageView2 = ((ChooseMusicSelectView) aObserverS78S0200000_15.l1).LJLJLJ;
        if (imageView2 != null) {
            imageView2.setAlpha(0.35f);
        } else {
            o.LJIJI("mIvMusicCut");
            throw null;
        }
    }

    public AObserverS78S0200000_15(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
