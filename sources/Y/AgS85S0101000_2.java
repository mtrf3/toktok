package Y;

import X.C10I;
import X.C10K;
import X.C16880lQ;
import X.C169776lR;
import X.C169786lS;
import X.C44384HbQ;
import X.C5RT;
import X.C5RV;
import X.C84939XVf;
import X.InterfaceC171226nm;
import X.XRT;
import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.kids.music.model.MusicList;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes3.dex */
public class AgS85S0101000_2 implements C10I {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object then$0(AgS85S0101000_2 agS85S0101000_2, C10K c10k) {
        switch (agS85S0101000_2.i1) {
            case 0:
                Context context = (Context) agS85S0101000_2.l0;
                if (((Boolean) c10k.LJIIJJI()).booleanValue()) {
                    C16880lQ.LLZILL(Toast.makeText(context, R.string.sck, 1));
                }
                return null;
            default:
                C169776lR c169776lR = (C169776lR) agS85S0101000_2.l0;
                MutableLiveData<Boolean> mutableLiveData = c169776lR.LJI;
                Boolean bool = Boolean.FALSE;
                mutableLiveData.setValue(bool);
                if (c10k.LJIILIIL() && ((Boolean) c10k.LJIIJJI()).booleanValue()) {
                    c169776lR.LJFF.setValue(Boolean.TRUE);
                    EffectPointModel effectPointModel = c169776lR.LJJJIL;
                    if (effectPointModel != null && TextUtils.equals("1", effectPointModel.getKey()) && c169776lR.LJJIL) {
                        C5RT c5rt = (C5RT) c169776lR.LIZJ.getValue();
                        if (c5rt != null && c5rt.LJI == 0) {
                            C5RT LIZJ = C5RT.LIZJ(c169776lR.LJJIIJZLJL.LJZL());
                            LIZJ.LJII = c169776lR.LJJIIZ.LIZ;
                            c169776lR.LIZJ.setValue(LIZJ);
                        }
                        c169776lR.LJIIJJI();
                        C5RV LJII = C5RV.LJII();
                        c169776lR.LJIIIZ.setOverlayColor(c169776lR.LJJIJIIJI);
                        c169776lR.LJ.setValue(LJII);
                        c169776lR.LJIIL();
                    }
                } else {
                    c169776lR.LJFF.setValue(bool);
                }
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object then$1(AgS85S0101000_2 agS85S0101000_2, C10K c10k) {
        switch (agS85S0101000_2.i1) {
            case 0:
                C169786lS c169786lS = (C169786lS) agS85S0101000_2.l0;
                c169786lS.getClass();
                if (c10k.LJIILIIL() && ((Boolean) c10k.LJIIJJI()).booleanValue()) {
                    c169786lS.LJFF.setValue(Boolean.TRUE);
                    EffectPointModel effectPointModel = c169786lS.LJJIJL;
                    if (effectPointModel != null && TextUtils.equals("1", effectPointModel.getKey()) && c169786lS.LJJIJIIJIL) {
                        C5RT c5rt = (C5RT) c169786lS.LIZJ.getValue();
                        if (c5rt != null && c5rt.LJI == 0) {
                            C5RT LIZJ = C5RT.LIZJ(c169786lS.LJJIFFI.LJZL());
                            LIZJ.LJII = c169786lS.LJJII.LIZ;
                            c169786lS.LIZJ.setValue(LIZJ);
                        }
                        c169786lS.LJIIJ();
                        C5RV LJII = C5RV.LJII();
                        c169786lS.LJIIIIZZ.setOverlayColor(c169786lS.LJJIIJZLJL);
                        c169786lS.LJ.setValue(LJII);
                        c169786lS.LJIIJJI();
                    }
                } else {
                    c169786lS.LJFF.setValue(Boolean.FALSE);
                }
                return null;
            default:
                C84939XVf c84939XVf = (C84939XVf) agS85S0101000_2.l0;
                c84939XVf.LJI = false;
                if (c10k.LJIILJJIL()) {
                    c84939XVf.LIZIZ.jv0(1, "loadmore_status_hot_music_list");
                } else if (c10k.LJIILIIL()) {
                    MusicList musicList = (MusicList) c10k.LJIIJJI();
                    List list = (List) ((XRT) c84939XVf.LIZIZ.get("hot_music_list_data")).LIZ("list_data");
                    list.addAll(C44384HbQ.LJIJJLI(musicList.items));
                    XRT xrt = new XRT();
                    xrt.LIZ.put("loadmore_status_hot_music_list", 0);
                    int i = musicList.radioCursor;
                    if (i <= 0) {
                        i = musicList.cursor;
                    }
                    xrt.LIZ.put("list_cursor", Integer.valueOf(i));
                    xrt.LIZ.put("list_hasmore", Integer.valueOf(musicList.hasMore));
                    xrt.LIZ.put("action_type", 2);
                    xrt.LIZIZ("list_data", list);
                    c84939XVf.LIZIZ.jv0(xrt, "hot_music_list_data");
                }
                return null;
        }
    }

    public static final Object then$2(AgS85S0101000_2 agS85S0101000_2, C10K c10k) {
        switch (agS85S0101000_2.i1) {
            case 0:
                C84939XVf c84939XVf = (C84939XVf) agS85S0101000_2.l0;
                c84939XVf.LJ = false;
                if (c10k.LJIILJJIL()) {
                    c84939XVf.LIZIZ.jv0(1, "refresh_status_music_list");
                } else if (c10k.LJIILIIL()) {
                    c84939XVf.LIZIZ.jv0(0, "refresh_status_music_list");
                    MusicList musicList = (MusicList) c10k.LJIIJJI();
                    XRT xrt = new XRT();
                    int i = musicList.radioCursor;
                    if (i <= 0) {
                        i = musicList.cursor;
                    }
                    xrt.LIZ.put("list_cursor", Integer.valueOf(i));
                    xrt.LIZ.put("list_hasmore", Integer.valueOf(musicList.hasMore));
                    xrt.LIZ.put("action_type", 1);
                    xrt.LIZIZ("list_data", C44384HbQ.LJIJJLI(musicList.items));
                    c84939XVf.LIZIZ.jv0(xrt, "music_list");
                }
                return null;
            default:
                InterfaceC171226nm interfaceC171226nm = (InterfaceC171226nm) agS85S0101000_2.l0;
                if (interfaceC171226nm != null) {
                    interfaceC171226nm.LIZ();
                }
                return null;
        }
    }

    public AgS85S0101000_2(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
