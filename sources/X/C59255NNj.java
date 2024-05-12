package X;

import com.bytedance.vast.model.AdVerification;
import java.io.Serializable;
import java.util.List;

/* renamed from: X.NNj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59255NNj implements Serializable, Cloneable {
    public String adSystem;
    public String adTitle;
    public List<AdVerification> adVerificationList;
    public List<C59259NNn> creativeList;
    public String description;
    public java.util.Set<String> errorSet;
    public java.util.Set<String> impressionSet;
    public java.util.Set<String> notViewableSet;
    public String version;
    public java.util.Set<String> viewUndeterminedSet;
    public java.util.Set<String> viewableSet;

    public Boolean parseContent(String str, int i) {
        return Boolean.valueOf(new C59262NNq(this).LIZJ(i, str));
    }

    public Boolean parseUri(String str, int i) {
        return Boolean.valueOf(new C59262NNq(this).LJFF(i, str));
    }

    public Boolean parseContent(String str, int i, InterfaceC59268NNw interfaceC59268NNw) {
        return Boolean.valueOf(new C59262NNq(this, interfaceC59268NNw).LIZJ(i, str));
    }

    public Boolean parseUri(String str, int i, InterfaceC59268NNw interfaceC59268NNw) {
        return Boolean.valueOf(new C59262NNq(this, interfaceC59268NNw).LJFF(i, str));
    }

    public Boolean parseContent(String str, int i, InterfaceC59268NNw interfaceC59268NNw, InterfaceC59264NNs interfaceC59264NNs) {
        return Boolean.valueOf(new C59262NNq(this, interfaceC59268NNw, interfaceC59264NNs).LIZJ(i, str));
    }

    public Boolean parseUri(String str, int i, InterfaceC59268NNw interfaceC59268NNw, InterfaceC59264NNs interfaceC59264NNs) {
        return Boolean.valueOf(new C59262NNq(this, interfaceC59268NNw, interfaceC59264NNs).LJFF(i, str));
    }
}
