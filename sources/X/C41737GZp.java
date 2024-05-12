package X;

import com.ss.android.ugc.aweme.editpost.EditPostResponse;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.GZp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41737GZp extends AbstractC41873Gc1 {
    public final GUX LJ;
    public final Object LJFF;
    public C43404H1s LJI;
    public InterfaceC43387H1b LJII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41737GZp(Object netTag, GUX gux) {
        super(netTag, 2);
        o.LJIIIZ(netTag, "netTag");
        this.LJ = gux;
        this.LJFF = netTag;
    }

    @Override // X.AbstractC41873Gc1
    public final void LJ(Object sourceTag, ERR args) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(args, "args");
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof C43404H1s) {
                if (next != null) {
                    this.LJI = (C43404H1s) next;
                    Iterator<Object> it2 = args.LIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (next2 instanceof InterfaceC43387H1b) {
                            if (next2 != null) {
                                this.LJII = (InterfaceC43387H1b) next2;
                                return;
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.publisherbuilder.ITaskExternalDependencyFactory");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZ(Object sourceTag, AbstractC42983Gtv cause, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(cause, "cause");
        GUX gux = this.LJ;
        GAI gai = GAI.LIZ;
        C43404H1s c43404H1s = this.LJI;
        if (c43404H1s != null) {
            gux.onFinish(gai, null, c43404H1s.LIZ);
        } else {
            o.LJIJI("publishModelContainer");
            throw null;
        }
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZJ(Object sourceTag, C42360Gjs error, int i, int i2) {
        int i3;
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(error, "error");
        InterfaceC43387H1b interfaceC43387H1b = this.LJII;
        if (interfaceC43387H1b != null) {
            C77413UZt LJ = interfaceC43387H1b.LJ();
            if (error.getCode() != 0) {
                i3 = error.getCode();
            } else {
                i3 = 1147;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_code", error.getCode());
            jSONObject.put("error_msg", error.toString());
            LJ.getClass();
            C43882HKc.LIZLLL(i3, "edit_post_save_error_rate", jSONObject, true);
            GUX gux = this.LJ;
            String valueOf = String.valueOf(error.getCode());
            String obj = this.LJFF.toString();
            C41738GZq c41738GZq = C41767GaJ.Companion;
            int code = error.getCode();
            c41738GZq.getClass();
            C41478GPq c41478GPq = new C41478GPq(new C41606GUo(valueOf, obj, ORY.LJJIJIIJIL(Integer.valueOf(code), C41767GaJ.USER_NETWORK_BAD_CODES), error.getT(), null));
            C43404H1s c43404H1s = this.LJI;
            if (c43404H1s != null) {
                gux.onFinish(c41478GPq, null, c43404H1s.LIZ);
                return;
            } else {
                o.LJIJI("publishModelContainer");
                throw null;
            }
        }
        o.LJIJI("dependency");
        throw null;
    }

    @Override // X.AbstractC41873Gc1
    public final void LJFF(Object sourceTag, Object obj, boolean z, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJII(obj, "null cannot be cast to non-null type com.bytedance.wave.core.Args");
        Iterator<Object> it = ((ERR) obj).LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof EditPostResponse) {
                if (next != null) {
                    EditPostResponse editPostResponse = (EditPostResponse) next;
                    InterfaceC43387H1b interfaceC43387H1b = this.LJII;
                    if (interfaceC43387H1b != null) {
                        C77413UZt LJ = interfaceC43387H1b.LJ();
                        int statusCode = editPostResponse.getStatusCode();
                        JSONObject jSONObject = new JSONObject();
                        if (editPostResponse.getStatusCode() != 0) {
                            jSONObject.put("status_msg", editPostResponse.getStatusMsg());
                            jSONObject.put("error_msg", editPostResponse.getErrorMsg());
                            jSONObject.put("biz_error_code", editPostResponse.getBizErrorCode());
                        }
                        LJ.getClass();
                        C43882HKc.LIZLLL(statusCode, "edit_post_save_error_rate", jSONObject, true);
                        GUX gux = this.LJ;
                        GAA gaa = new GAA(editPostResponse);
                        C43404H1s c43404H1s = this.LJI;
                        if (c43404H1s != null) {
                            gux.onFinish(gaa, null, c43404H1s.LIZ);
                            return;
                        } else {
                            o.LJIJI("publishModelContainer");
                            throw null;
                        }
                    }
                    o.LJIJI("dependency");
                    throw null;
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.editpost.EditPostResponse");
    }
}
