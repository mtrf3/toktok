package X;

import android.os.Message;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.android.vesdk.VEEditor;

/* loaded from: classes16.dex */
public class YO8 implements X0P {
    public final /* synthetic */ VEEditor LIZ;

    public YO8(VEEditor vEEditor) {
        this.LIZ = vEEditor;
    }

    @Override // X.X0P
    public final void LIZ(int i, int i2, float f, String str) {
        RunnableC87291YNr runnableC87291YNr;
        RunnableC87291YNr runnableC87291YNr2;
        if (i != 4101) {
            if (i != 4103) {
                if (i != 4105) {
                    if (i != 4129) {
                        if (i != 4157) {
                            if (i != 4133) {
                                if (i != 4134) {
                                    if (i != 4144) {
                                        if (i != 4145) {
                                            if (i != 4160) {
                                                if (i != 4161) {
                                                    if (this.LIZ.LJLLLL != null) {
                                                        StringBuilder LIZ = X1D.LIZ();
                                                        LIZ.append("TECommonCallback type:");
                                                        LIZ.append(i);
                                                        P4Q.LIZ("VEEditor", X1D.LIZIZ(LIZ));
                                                        this.LIZ.LJLLLL.LIZ(i, i2, f, str);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                VEEditor vEEditor = this.LIZ;
                                                if (!vEEditor.LLIZLLLIL || (runnableC87291YNr2 = vEEditor.LLJ) == null) {
                                                    return;
                                                }
                                                runnableC87291YNr2.LJLJLJ = i2;
                                                return;
                                            }
                                            VEEditor vEEditor2 = this.LIZ;
                                            if (!vEEditor2.LLIZLLLIL || (runnableC87291YNr = vEEditor2.LLJ) == null) {
                                                return;
                                            }
                                            runnableC87291YNr.LJLJL = i2;
                                            return;
                                        }
                                        if (this.LIZ.LJLLJ != null) {
                                            this.LIZ.LJLLJ.LIZIZ();
                                            return;
                                        } else {
                                            if (this.LIZ.LJLLLL == null) {
                                                return;
                                            }
                                            Q4K.LJ("TECommonCallback type:", i, "VEEditor");
                                            this.LIZ.LJLLLL.LIZ(i, i2, f, str);
                                            return;
                                        }
                                    }
                                    if (this.LIZ.LJLLJ != null) {
                                        this.LIZ.LJLLJ.LIZ();
                                        return;
                                    } else {
                                        if (this.LIZ.LJLLLL == null) {
                                            return;
                                        }
                                        Q4K.LJ("TECommonCallback type:", i, "VEEditor");
                                        this.LIZ.LJLLLL.LIZ(i, i2, f, str);
                                        return;
                                    }
                                }
                                this.LIZ.LLJJJJJIL = f;
                                return;
                            }
                            this.LIZ.getClass();
                            return;
                        }
                        this.LIZ.getClass();
                        return;
                    }
                    VEEditor vEEditor3 = this.LIZ;
                    if (vEEditor3.LLILII != 0) {
                        return;
                    }
                    vEEditor3.LLILII = System.currentTimeMillis();
                    P4Q.LJFF("VEEditor", "TECommonCallback TE_INFO_FIRST_FRAME_WITHOUT_SURFACE");
                    return;
                }
                if (this.LIZ.LJLLI != null && this.LIZ.LJLJLLL != null) {
                    Message message = new Message();
                    message.what = i;
                    message.obj = Float.valueOf(f);
                    this.LIZ.LJLJLLL.sendMessage(message);
                    return;
                }
                InterfaceC133905Ni interfaceC133905Ni = this.LIZ.LJLLLL;
                if (interfaceC133905Ni == null) {
                    return;
                }
                interfaceC133905Ni.LIZ(i, i2, f, str);
                return;
            }
            VEEditor vEEditor4 = this.LIZ;
            if (vEEditor4.LLIZLLLIL) {
                vEEditor4.LLJ.LJLJJI = vEEditor4.LJLLLL;
                new PthreadThread(this.LIZ.LLJ, "dk/VEEditor$1").start();
                this.LIZ.LLIZLLLIL = false;
                return;
            } else {
                if (vEEditor4.LJLLI != null && this.LIZ.LJLJLLL != null) {
                    P4Q.LJII("VEEditor", "mCompileListener TE_INFO_COMPILE_DONE");
                    Message message2 = new Message();
                    message2.what = 4103;
                    message2.arg1 = i2;
                    message2.obj = str;
                    this.LIZ.LJLJLLL.sendMessage(message2);
                    return;
                }
                if (this.LIZ.LJLLLL == null) {
                    return;
                }
                P4Q.LJII("VEEditor", "TECommonCallback TE_INFO_COMPILE_DONE");
                this.LIZ.LJLLLL.LIZ(i, i2, f, str);
                return;
            }
        }
        if (this.LIZ.LLIL > 0) {
            System.currentTimeMillis();
        }
        if (this.LIZ.LJLL != null && this.LIZ.LJLJLLL != null) {
            P4Q.LJII("VEEditor", "mSeekListener TE_INFO_SEEK_DONE");
            this.LIZ.LJLJLLL.sendEmptyMessage(4101);
        } else {
            if (this.LIZ.LJLLLL == null) {
                return;
            }
            P4Q.LJII("VEEditor", "TECommonCallback TE_INFO_SEEK_DONE");
            this.LIZ.LJLLLL.LIZ(i, i2, f, str);
        }
    }
}
