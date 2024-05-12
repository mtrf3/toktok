package X;

import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Date;

/* loaded from: classes12.dex */
public final class P9C extends X509Certificate {
    public final X509Certificate LJLIL;
    public final byte[] LJLILLLLZI;

    @Override // java.security.cert.X509Certificate
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final void checkValidity() {
        this.LJLIL.checkValidity();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final void checkValidity(Date date) {
        this.LJLIL.checkValidity(date);
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final int getBasicConstraints() {
        return this.LJLIL.getBasicConstraints();
    }

    @Override // java.security.cert.X509Extension
    /* renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public final java.util.Set getCriticalExtensionOIDs() {
        return this.LJLIL.getCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Extension
    /* renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public final byte[] getExtensionValue(String str) {
        return this.LJLIL.getExtensionValue(str);
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: LJFF, reason: merged with bridge method [inline-methods] */
    public final Principal getIssuerDN() {
        return this.LJLIL.getIssuerDN();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: LJI, reason: merged with bridge method [inline-methods] */
    public final boolean[] getIssuerUniqueID() {
        return this.LJLIL.getIssuerUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: LJII, reason: merged with bridge method [inline-methods] */
    public final boolean[] getKeyUsage() {
        return this.LJLIL.getKeyUsage();
    }

    @Override // java.security.cert.X509Extension
    /* renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
    public final java.util.Set getNonCriticalExtensionOIDs() {
        return this.LJLIL.getNonCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: LJIIIZ, reason: merged with bridge method [inline-methods] */
    public final Date getNotAfter() {
        return this.LJLIL.getNotAfter();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: LJIIJ, reason: merged with bridge method [inline-methods] */
    public final Date getNotBefore() {
        return this.LJLIL.getNotBefore();
    }

    @Override // java.security.cert.Certificate
    /* renamed from: LJIIJJI, reason: merged with bridge method [inline-methods] */
    public final PublicKey getPublicKey() {
        return this.LJLIL.getPublicKey();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: LJIIL, reason: merged with bridge method [inline-methods] */
    public final BigInteger getSerialNumber() {
        return this.LJLIL.getSerialNumber();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: LJIILIIL, reason: merged with bridge method [inline-methods] */
    public final String getSigAlgName() {
        return this.LJLIL.getSigAlgName();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: LJIILJJIL, reason: merged with bridge method [inline-methods] */
    public final String getSigAlgOID() {
        return this.LJLIL.getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: LJIILL, reason: merged with bridge method [inline-methods] */
    public final byte[] getSigAlgParams() {
        return this.LJLIL.getSigAlgParams();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: LJIILLIIL, reason: merged with bridge method [inline-methods] */
    public final byte[] getSignature() {
        return this.LJLIL.getSignature();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: LJIIZILJ, reason: merged with bridge method [inline-methods] */
    public final Principal getSubjectDN() {
        return this.LJLIL.getSubjectDN();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: LJIJ, reason: merged with bridge method [inline-methods] */
    public final boolean[] getSubjectUniqueID() {
        return this.LJLIL.getSubjectUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: LJIJI, reason: merged with bridge method [inline-methods] */
    public final byte[] getTBSCertificate() {
        return this.LJLIL.getTBSCertificate();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: LJIJJ, reason: merged with bridge method [inline-methods] */
    public final int getVersion() {
        return this.LJLIL.getVersion();
    }

    @Override // java.security.cert.X509Extension
    /* renamed from: LJIJJLI, reason: merged with bridge method [inline-methods] */
    public final boolean hasUnsupportedCriticalExtension() {
        return this.LJLIL.hasUnsupportedCriticalExtension();
    }

    @Override // java.security.cert.Certificate
    /* renamed from: LJIL, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return this.LJLIL.toString();
    }

    @Override // java.security.cert.Certificate
    /* renamed from: LJJ, reason: merged with bridge method [inline-methods] */
    public final void verify(PublicKey publicKey) {
        this.LJLIL.verify(publicKey);
    }

    @Override // java.security.cert.Certificate
    /* renamed from: LJJI, reason: merged with bridge method [inline-methods] */
    public final void verify(PublicKey publicKey, String str) {
        this.LJLIL.verify(publicKey, str);
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.LJLILLLLZI;
    }

    public P9C(X509Certificate x509Certificate, byte[] bArr) {
        this.LJLIL = x509Certificate;
        this.LJLILLLLZI = bArr;
    }
}
