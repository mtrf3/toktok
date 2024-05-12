package com.ss.android.ugc.aweme.commercialize.model;

import X.C59255NNj;
import X.C59259NNn;
import X.InterfaceC65349Pkn;
import X.O1A;
import com.bytedance.vast.model.AdVerification;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

/* loaded from: classes11.dex */
public class OmVast implements Serializable {

    @InterfaceC65349Pkn("ad_choice")
    public NativeIcon adChoiceIcon;

    @InterfaceC65349Pkn("adVerifications")
    public List<AdVerification> adVerificationList;

    @InterfaceC65349Pkn("extra_ad_verifications")
    public List<AdVerification> extraAdVerificationList;

    @InterfaceC65349Pkn("enable_content_url")
    public boolean isEnableContentUrl;

    @InterfaceC65349Pkn("local_cache_loaded")
    public boolean loaded;
    public transient boolean loading;

    @InterfaceC65349Pkn("local_cache_vast")
    public C59255NNj vast;

    @O1A(serialize = false)
    @InterfaceC65349Pkn("vastContent")
    public String vastContent;

    @O1A(serialize = false)
    @InterfaceC65349Pkn("vastUrl")
    public String vastUrl;

    @O1A(serialize = false)
    @InterfaceC65349Pkn("vastWrapperCount")
    public int vastWrapperCount = 1;

    @InterfaceC65349Pkn("providerType")
    public int providerType = 2;

    @O1A(serialize = false)
    @InterfaceC65349Pkn("creative_type")
    public int creative_type = 4;

    @O1A(serialize = false)
    @InterfaceC65349Pkn("impression_type")
    public int impression_type = 4;

    public List<C59259NNn> getCreativeList() {
        C59255NNj c59255NNj = this.vast;
        if (c59255NNj == null) {
            return null;
        }
        return c59255NNj.creativeList;
    }

    public Set<String> getImpressions() {
        C59255NNj c59255NNj = this.vast;
        if (c59255NNj == null) {
            return null;
        }
        return c59255NNj.impressionSet;
    }
}
