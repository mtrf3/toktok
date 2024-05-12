package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.publish.privacy.PermissionConfigure;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.AqS95S0101000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G9B {
    public final Context LIZ;
    public final PermissionConfigure LIZIZ;
    public final MutableLiveData<C150575vZ<Integer, Boolean>> LIZJ;
    public final MutableLiveData LIZLLL;
    public final MutableLiveData<C150575vZ<Boolean, String>> LJ;
    public final MutableLiveData LJFF;
    public boolean LJI;

    public final String LIZIZ() {
        String str;
        VideoPublishEditModel videoPublishEditModel = this.LIZIZ.getVideoPublishEditModel();
        String str2 = null;
        if (videoPublishEditModel != null) {
            str = videoPublishEditModel.playlist_name;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            String string = this.LIZ.getString(R.string.ith);
            o.LJIIIIZZ(string, "context.getString(R.stri…non_public_settings_desc)");
            Object[] objArr = new Object[1];
            VideoPublishEditModel videoPublishEditModel2 = this.LIZIZ.getVideoPublishEditModel();
            if (videoPublishEditModel2 != null) {
                str2 = videoPublishEditModel2.playlist_name;
            }
            objArr[0] = str2;
            return Q8U.LIZIZ(objArr, 1, string, "format(format, *args)");
        }
        return "";
    }

    public final void LIZ(int i) {
        this.LIZJ.setValue(new C150575vZ<>(new OSZ(Integer.valueOf(i), Boolean.TRUE)));
    }

    public final void LIZJ(int i) {
        String str;
        String str2;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        return;
                    }
                    if (this.LJI) {
                        VideoPublishEditModel videoPublishEditModel = this.LIZIZ.getVideoPublishEditModel();
                        String str3 = null;
                        if (videoPublishEditModel != null) {
                            str = videoPublishEditModel.playlist_name;
                        } else {
                            str = null;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            String string = this.LIZ.getString(R.string.ru6);
                            o.LJIIIIZZ(string, "context.getString(R.stri…ySet_playlist_modal_desc)");
                            Object[] objArr = new Object[1];
                            VideoPublishEditModel videoPublishEditModel2 = this.LIZIZ.getVideoPublishEditModel();
                            if (videoPublishEditModel2 != null) {
                                str3 = videoPublishEditModel2.playlist_name;
                            }
                            objArr[0] = str3;
                            str2 = Q8U.LIZIZ(objArr, 1, string, "format(format, *args)");
                        } else {
                            str2 = "";
                        }
                        if (TextUtils.isEmpty(str2)) {
                            String string2 = this.LIZ.getString(R.string.gi5);
                            o.LJIIIIZZ(string2, "context.getString(descriptionRes)");
                            LIZLLL(4, string2);
                            return;
                        }
                        LIZLLL(4, str2);
                        return;
                    }
                    LIZ(4);
                    return;
                }
                if (this.LJI) {
                    LIZLLL(2, LIZIZ());
                    return;
                } else {
                    LIZ(2);
                    return;
                }
            }
            if (this.LJI) {
                String LIZIZ = LIZIZ();
                if (TextUtils.isEmpty(LIZIZ)) {
                    String string3 = this.LIZ.getString(R.string.gi5);
                    o.LJIIIIZZ(string3, "context.getString(descriptionRes)");
                    LIZLLL(1, string3);
                    return;
                }
                LIZLLL(1, LIZIZ);
                return;
            }
            LIZ(1);
            return;
        }
        LIZ(0);
    }

    public G9B(Context context, PermissionConfigure permissionConfigure) {
        boolean z;
        String str;
        this.LIZ = context;
        this.LIZIZ = permissionConfigure;
        MutableLiveData<C150575vZ<Integer, Boolean>> mutableLiveData = new MutableLiveData<>();
        this.LIZJ = mutableLiveData;
        this.LIZLLL = mutableLiveData;
        MutableLiveData<C150575vZ<Boolean, String>> mutableLiveData2 = new MutableLiveData<>();
        this.LJ = mutableLiveData2;
        this.LJFF = mutableLiveData2;
        if (permissionConfigure.getCurrentPermission() == 0) {
            VideoPublishEditModel videoPublishEditModel = permissionConfigure.getVideoPublishEditModel();
            if (videoPublishEditModel != null) {
                str = videoPublishEditModel.playlist_name;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                z = true;
                this.LJI = z;
                mutableLiveData.setValue(new C150575vZ<>(new OSZ(Integer.valueOf(permissionConfigure.getCurrentPermission()), Boolean.FALSE)));
                mutableLiveData2.setValue(new C150575vZ<>(new OSZ(Boolean.valueOf(permissionConfigure.getPreventSelfSee()), "")));
                new AqS189S0100000_7(this, 17);
            }
        }
        z = false;
        this.LJI = z;
        mutableLiveData.setValue(new C150575vZ<>(new OSZ(Integer.valueOf(permissionConfigure.getCurrentPermission()), Boolean.FALSE)));
        mutableLiveData2.setValue(new C150575vZ<>(new OSZ(Boolean.valueOf(permissionConfigure.getPreventSelfSee()), "")));
        new AqS189S0100000_7(this, 17);
    }

    public final void LIZLLL(int i, String str) {
        int i2;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        i2 = R.string.itg;
                    } else {
                        i2 = R.string.ru7;
                    }
                } else {
                    i2 = R.string.ppi;
                }
            } else {
                i2 = R.string.ppj;
            }
        } else {
            i2 = R.string.ppk;
        }
        C26227ARb LIZ = C3AW.LIZ(this.LIZ);
        LIZ.LJ(i2);
        LIZ.LIZIZ(str);
        UC0.LIZJ(LIZ, new AqS95S0101000_7(this, i, 5));
        LIZ.LJI().LIZLLL();
    }
}
